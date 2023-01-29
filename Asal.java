package advanceCalculator;

import java.util.Scanner;

public class Asal {
    
    static boolean asalmi(int number, int x){      
 
        if (number < 2) {
           
            return false;

        }
        if(number == 2){
            System.out.println(x);
   return true;         
        }
        if (number % x != 0 && x>=number-1) {
        
            return true;
        }else {
            if (number%x == 0) {
            	 
                return false;
                
            }else{
            	
                return asalmi(number, x+1);
            }
        }
      
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");

        int number = sc.nextInt();
        final int bolen = 2;
        
        if (asalmi(number, bolen)) {
            
            System.out.println(number +" Sayisi asaldir.");
            
        }else {
            System.out.println(number +" Sayisi asal degildir.");
        }
    }
    
}