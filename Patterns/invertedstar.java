package Patterns;

public class invertedstar {
    public static void invertedstar(int n) {
        for(int i=1; i<=n; i++) {

            // spaces (fixed: now depends on i)
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // stars (fixed: now depends on i)
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedstar(4);
    }
}