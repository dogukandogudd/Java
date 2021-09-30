package methods2;

import java.security.MessageDigest;

public class Main {

	public static void main(String[] args) {
		String message="The weather is very nice today";
		String newMessage = sehirVer();
		System.out.println(newMessage);
		int sayi = topla(5,7);
		System.out.println(sayi);

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
	
	public static String sehirVer() {
		return "Aydýn";
	}

}
