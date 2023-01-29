package advanceCalculator;

import java.util.Scanner;

public class Calculator {

	
	static int sum(int a , int b ) {
		int result =a+b ;
		System.out.println("Toplam ="  + result);
		return result;
		
	}
	
	static int min(int a , int b ) {
	int result= a-b ;
	System.out.println("Cikarma =" +result);
		return result ;
		
	}
	static int tim(int a , int b ) {
		int result= a*b ;
		System.out.println("Carpma =" +result);
			return result ;
			
		}
	static double div(double a , double  b ) {
      double result= a/b ;
      if(b==0) {
    	  System.out.println("Ikinci sayi 0 dan farki olmalidir ");
    	  return 0;
      }
		System.out.println("Bolme =" +result);
			return result ;
			
		}
	static int pow(int a , int b ) {
	     int result=1 ;
	     for(int i = 1 ;  i<=b ;i++)
	    	 result*=a ; 
			System.out.println("Uslu =" +result);
				return result ;
				}
    static int mod(int a , int b ) {
					int result= a%b ;
					System.out.println("Mod =" +result);
						return result ;
						
								
	}
	static void cal(int a , int b ) {
		System.out.println("Dikdortgenin cevresi =" + 2*(a+b) );
		System.out.println("Dikdortgenin alani ="+ a*b);
		

	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int select ;
		
		String menu = "1 - Toplama\n"
				+"2 - Cikarma\n"
				+"3 - Carpma\n"
				+"4 - Bolme\n"
				+"5 - Uslu sayi hesaplama\n"
				+"6 - Mod alma\n"
				+"7 - Dikdortgen alan ve cevre hesabi\n"
				+"0 - Cikis ";
		
		
		while (true) 	 {
			System.out.println(menu);
			System.out.println("Bir islem giriniz :");
			select=scan.nextInt();
			
			if (select==0) {
				break ;
			}
			
			System.out.println("Ilk sayiyi giriniz : ");
			int a =scan.nextInt();
			
			System.out.println("Ikinci sayiyi giriniz : ");
			int b =scan.nextInt();
			
			switch(select) {
			
			case 1  :
				sum(a,b);
				break ;
				
			case 2 :
                min(a,b);
				break;
			case 3 :
				tim(a,b);
				break;
				
			case 4 :
				div(a,b);
				break;
			case 5 :
				pow(a,b);
				break;
			case 6 :
				mod(a,b);
				break;
			case 7 :
				cal(a,b);
				break;
		
			default :
				System.out.println("Gecersiz bir islem girdiniz : ");
			
			}
				
					
			
			
		}System.out.println("Cikis yapiliyor");
		
	}

}
