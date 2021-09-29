package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String message ="The weather is so nice today.";
		System.out.println(message);		
		//---------------------------------------------------------------------
		System.out.println("number of characters :"+message.length());		
		//---------------------------------------------------------------------
		System.out.println("fifth character :"+message.charAt(4));		
		//---------------------------------------------------------------------
		System.out.println(message.concat(" Yip!"));		
		//---------------------------------------------------------------------
		System.out.println(message.startsWith("B"));		
		//---------------------------------------------------------------------
		System.out.println(message.endsWith("."));		
		//---------------------------------------------------------------------
		char[] characters=new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);		
		//---------------------------------------------------------------------
		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('a'));
		//---------------------------------------------------------------------
		String newMessage =message.replace(' ', '-');
		System.out.println(newMessage);
		//---------------------------------------------------------------------
		System.out.println(message.substring(2,25));
		//---------------------------------------------------------------------
		for(String word:message.split(" ")) {
			System.out.println(word);
		}
		//---------------------------------------------------------------------
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		//---------------------------------------------------------------------
		System.out.println(message.trim());
		
		
		
	}

}
