package patterns;

import java.util.Scanner;

public class sume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            String n = sc.nextLine();
              if(n.equals("x")){
                break;
              }
              sum  = sum + Integer.parseInt(n);
                
            
        }
        System.out.println(sum);

    }
}
