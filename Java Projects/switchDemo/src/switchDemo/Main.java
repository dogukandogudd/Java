package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade ='Z';
		
		switch(grade) {
		case 'A':
			System.out.println("A ile Ge�tiniz");
			break;
		case 'B':
			System.out.println("B ile Ge�tiniz");
			break;
		case 'C':
			System.out.println("C ile Ge�tiniz");
			break;
		case 'D':
			System.out.println("D ile Ge�tiniz");
			break;
		case 'F':
			System.out.println("Kald�n�z");
			break;
			
			default:
				System.out.println("Ge�ersiz Not");
		}

	}

}
