package patterns;

import java.util.Scanner;

public class leap{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int num1 = a;
    int num2 = b ;
      while (num1 % num2 != 0){
        int rem = num1 % num2;
        num1 = num2 ;
        num2 = rem;
      }
     int hcf = num2;
     int LCM = (a*b)/hcf;
        System.out.println(hcf + "  "+ LCM);
    }
}


