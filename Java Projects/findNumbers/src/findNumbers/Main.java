package findNumbers;

public class Main {

	public static void main(String[] args) {
		int[] numbers =new int[] {1,2,5,7,9,0};
		int willBeFound =5;
		boolean isThere=false;
		
		for(int number:numbers) {
			if(number==willBeFound) {
				isThere =true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("number available");
		}else {
			System.out.println("number not available");
		}

	}

}
