package PatternPrinting;

import java.util.Scanner;

public class HomeworkPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            // print dashes
            for(int j = 1; j <= i - 1; j++) {
                System.out.print("- ");
            }

            // print stars
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}