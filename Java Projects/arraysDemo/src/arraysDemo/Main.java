package arraysDemo;

public class Main {

	public static void main(String[] args) {
	String ogrenci1 ="Do�ukan1";
	String ogrenci2 ="Do�ukan2";
	String ogrenci3 ="Do�ukan3";
	String ogrenci4 ="Do�ukan4";
	
	System.out.println(ogrenci1);
	System.out.println(ogrenci2);
	System.out.println(ogrenci3);
	System.out.println(ogrenci4);
	
	System.out.println("---------");
	
	String[] ogrenciler = new String[4];
	ogrenciler[0]="Do�ukan";
	ogrenciler[1]="Fikri";
	ogrenciler[2]="Burkay";
	ogrenciler[3]="Ali �hsan";
	
	for(int i=0;i<ogrenciler.length;i++) {
		System.out.println(ogrenciler[i]);
	}
	
	System.out.println("---------");
	
	for(String ogrenci:ogrenciler) {
		System.out.println(ogrenci);
	}
	
	}

}
