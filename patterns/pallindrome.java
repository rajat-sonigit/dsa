package patterns;

public class pallindrome {
    public static void main(String[] args) {
        String s = "madam";
        String org = s ;
         int le = s.length();
         String rev = "";
         for (int i = le - 1; i>=0 ; i--){
             rev = rev + s.charAt(i);
         }
         System.out.println(org);
         System.out.println(rev);
          if (org.equals(rev)){
              System.out.println("its pallindrome string");
          }else {
              System.out.println(" its not pallindrome");
          }
    }
}
