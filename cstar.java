public class cstar {
    public static void main(String[] args) {
        int n = 5; // You can change this value to increase/decrease the size of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == (n - i + 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
