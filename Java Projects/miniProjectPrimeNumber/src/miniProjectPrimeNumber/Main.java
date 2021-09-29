package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		
		int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
               if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                } 
            }
                
            if(kontrol==0)
            {
                System.out.print(sayi+"\n");
                sayac++; 
                System.out.print(sayac);
            }
        }
        
		/*
		int number =3;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		for(int i=2;i<number;i++) {
			if(number % 1 ==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println("number prime");
		}else {
			System.out.println("number is not prime");
		}*/
			
	}

}
