import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.swing.*;

public class Server extends JFrame{
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;;
	private ServerSocket server;
	private Socket connection;

	//Constructor
	public Server(){
		super("My Instant Messenger");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
			new ActionListener(){
				public void actionPErformed(ActionEvent event){
					sendMessage(event.getActionCommand());
					userText.Text("");
				}
			}
		);
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(300, 150);
		setVisible(true);
	}

	//set up and run the server
	public void startRunning(){
		try{
			server = new ServerSocket(6789, 100);
			while(true){
				try{
					waitForConnection();
					setupStreams();
					whileChatting();

				}catch(EOFException eofException){
					showMessage("\n Server ended the connection!! ");
				}finally{
					closeCrap();
				}
			}
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	//Wait for connection, then display connection information
	private void waitForConnection() throws IOException{
		showMessage("Waiting for someone to connect... \n");
		connection = server.accept();
		showMessage("Now connected to "+ connection.getInetAdress().getHostName());
	}

	//Get stream to send and receive data
	private void setupStreams() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Strea,e are now setup!!!\n");
	}

	//During the chat conversation
	private void whileChatting() throws IOException{
		String message = "You are now connected! ";
		sendMessage(message);
		ableToType(true);
		do{
			try{
				message = (String) input.readObject();
				showMessage("\n"+message);
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("\n the user has sent something! ");
			}
		}while(!message.equals("CLIENT - END"));
	}
	//close streams and sockets after you are done chatting
	private void closeCrap(){
		showMessage("\n Closing connections... \n");
		ableToType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	private void sendMessage(String message){
		try{
			output.writeObject("SERVER - "+message);
			output.flush();
			showMessage("\nSERVER - "+message);
		}catch(IOException ioException){
			chatWindow.append("\n ERROR: AISH! I CANT SEND THAT MESSAGE!");
		}
	}

	//updates chatWindow
	private void showMessage(final String text){
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run(){
					chatWindow.append(text);
				}
			}
		);
	}

	//let the user type stuff into their box
	private void ableToType(final boolean tof){
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run(){
					userText.setEditable(tof);
				}
			}
		);
	}
}
