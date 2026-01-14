package patterns;

public class amstrong {
    public static void main(String[] args) {
          int n = 153;
       int org = n ; 
       int sum = 0 ; 
       while(n>0){
           int temp = n%10;
           sum = sum + (temp * temp*temp);
           n = n/10;
       }
       System.out.println(sum);
       if (org == sum) {
           System.out.println("It is an Armstrong number");
       } else {
           System.out.println("It is not an Armstrong number");
       }
    }
}
