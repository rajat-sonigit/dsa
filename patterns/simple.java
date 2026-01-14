package patterns;

import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount ");
        int principal = sc.nextInt();
        System.out.println(" Enter the rate of principal");
        int rate = sc.nextInt();
        System.out.println(" enter the time period ");
        int time = sc.nextInt();

        int simpleintrest = (principal * rate * time) / 100;
        System.out.println(" the simple intrest is " + simpleintrest);
        sc.close();
    }
}
