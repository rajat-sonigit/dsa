package patterns;

import java.util.Scanner;

public class pericircle {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
         System.out.println("enter the side of the triangle");
          int radius = sc.nextInt();
          double peri = pericircle(radius);
          System.out.println(peri);
   }
    public static double pericircle(int radius){
       double peri = (3.14 * radius) * 2;
       return peri;
   }
}
