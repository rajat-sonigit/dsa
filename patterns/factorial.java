package patterns;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
         System.out.println("enter the number to get factorial");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int factorial = 1 ;
        while(m>0){
            factorial *= m ;
            m--;
        }
        System.out.println(factorial);
    }
}
