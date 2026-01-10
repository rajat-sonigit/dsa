package patterns;

public class bridge {
    public static void main(String[] args) {
         int  bridge = 5;
         for (int i= 1;i<=(2*bridge)-1;i++){
            System.out.print("*");
            
        }
        System.out.println();
     for(int i = 1;i<=bridge;i++){
        
        for(int j = 1;j<=bridge-i;j++){
            System.out.print("*");
        }
          
         for(int j = 1;j<=(2*i)-1;j++){
            System.out.print(" ");
        }
         for(int j = 1;j<=bridge-i;j++){
            System.out.print("*");
        }
        System.out.println();
     }
    }
   
}
