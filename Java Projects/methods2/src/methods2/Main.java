package methods2;


public class Main {

	public static void main(String[] args) {
		String message="The weather is very nice today";
		String newMessage = sehirVer();
		System.out.println(newMessage);
		int sayi = topla(15,7);
		System.out.println(sayi);
		System.out.println(message);
		int toplam=topla2(2,3,4);
		System.out.println(toplam);

	}
	
	public static void ekle() {
		System.out.println("Added");		
	}
	
	public static void sil() {
		System.out.println("Deleted");
	}
	
	public static void guncelle() {
		System.out.println("Updated");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	//Variable Arguments
	public static int topla2 (int...sayilar ) {
	int toplam=0;
	for (int sayi:sayilar) {
		toplam+=sayi;
		
	}
	return toplam;
	}
	
	public static String sehirVer() {
		return "Ayd�n";
	}

}
