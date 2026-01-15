package patterns;

import java.util.Scanner;

public class areaofequiletraltrinangle {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
         System.out.println("enter the side of the triangle");
          int a = sc.nextInt();
          double area =  equitri(a);
          System.out.println("area is "+ area);
    }
     public static double equitri(int a){
        double area = (Math.sqrt(3) * (a* a)) / 4;
        return area;
        
    }
}
