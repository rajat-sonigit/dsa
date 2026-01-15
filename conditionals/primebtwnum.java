package conditionals;

public class primebtwnum {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 50;

        for (int i = num1; i <= num2; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && i > 1) {
                System.out.println(i + " is a prime number.");
            }
        }  
    }
}
