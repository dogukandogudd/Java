package arraysDemo;

public class Main {

	public static void main(String[] args) {
	String ogrenci1 ="Doðukan1";
	String ogrenci2 ="Doðukan2";
	String ogrenci3 ="Doðukan3";
	String ogrenci4 ="Doðukan4";
	
	System.out.println(ogrenci1);
	System.out.println(ogrenci2);
	System.out.println(ogrenci3);
	System.out.println(ogrenci4);
	
	System.out.println("---------");
	
	String[] ogrenciler = new String[4];
	ogrenciler[0]="Doðukan";
	ogrenciler[1]="Fikri";
	ogrenciler[2]="Burkay";
	ogrenciler[3]="Ali Ýhsan";
	
	for(int i=0;i<ogrenciler.length;i++) {
		System.out.println(ogrenciler[i]);
	}
	
	System.out.println("---------");
	
	for(String ogrenci:ogrenciler) {
		System.out.println(ogrenci);
	}
	
	}

}
