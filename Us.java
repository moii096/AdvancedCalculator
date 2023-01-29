package advanceCalculator;

import java.util.Scanner;

public class Us {

	 static int power() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Taban degeri giriniz :");
	        int base = scan.nextInt();
	        System.out.print("Us degeri giriniz :");
	        int exponent = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }
     return result ;
	        
	    }
	
	public static void main(String[] args) {
		System.out.println(power()) ;

	}

}
