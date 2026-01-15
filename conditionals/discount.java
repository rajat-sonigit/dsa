package conditionals;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the mrp");
        int mrp = sc.nextInt();
        System.out.println("enter the sold price ");
        int sold = sc.nextInt();
        double x = (((mrp - sold) * 100) / mrp);
        System.out.println(x);
        
        System.out.println("your discount is = " + x +"%");
    }
}
