package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		//For
		for (int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Loop Finished");
		
		
		//While
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		//infinite Loop
		System.out.println("While Loop Finished");
		
		//Do-While
		int j=100;
		do{
			System.out.println("Logland�");
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Loop Finished");
		
		
	}

}
