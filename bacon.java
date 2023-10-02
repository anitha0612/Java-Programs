public class bacon{
	public static void main(String args[]){
		String[] words={"tanjiro","muichiro","nezuko","konoha","tanin"};
		for(String w : words){
			if(w.startsWith("ta"))
				System.out.println(w + " starts with ta");
		}
		for(String w : words){
			if(w.endsWith("ro"))
				System.out.println(w + " ends with ro");
		}
		String s="Demon Slayer";
		String t=" Tanjiro ";
		System.out.println(s.indexOf('a'));
		System.out.println(t.concat(s));
		System.out.println(t.replace('T','M'));
	}

}