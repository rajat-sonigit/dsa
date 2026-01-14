package patterns;

import java.util.Scanner;

public class currency {
public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println(" Enter the amount in INR ");
     int inr = sc.nextInt();
         System.out.println(" Select the currency to convert to: ");
          System.out.println(" 1. USD "); 
          System.out.println(" 2. EURO ");
          System.out.println(" 3. POUND "); 
          System.out.println(" 4. YEN ");
        int choice = sc.nextInt();

    
      switch (choice){
        case 1:
        double usd = inr * 0.012;
        System.out.println(" the amount in USD is " + usd);
        break;
        
        case 2:
        double euro = inr * 0.011;
        System.out.println(" the amount in EURO is " + euro);
        break;

        case 3:
        double pound = inr * 0.0099;
        System.out.println(" the amount in POUND is " + pound);
        break;

        case 4:
        double yen = inr * 1.62;
        System.out.println(" the amount in YEN is " + yen);
        break;

        default:
        System.out.println(" invalid input ");
}
}


      }

