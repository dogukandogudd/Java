package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade ='Z';
		
		switch(grade) {
		case 'A':
			System.out.println("A ile Geçtiniz");
			break;
		case 'B':
			System.out.println("B ile Geçtiniz");
			break;
		case 'C':
			System.out.println("C ile Geçtiniz");
			break;
		case 'D':
			System.out.println("D ile Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldýnýz");
			break;
			
			default:
				System.out.println("Geçersiz Not");
		}

	}

}
