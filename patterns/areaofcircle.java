package patterns;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int a = sc.nextInt();
        double radius = 3.14 * (a*a);
        System.out.println("your radius is = " + radius);
    }
}
