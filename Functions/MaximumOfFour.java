package Functions;

import java.util.Scanner;

public class MaximumOfFour {

    public static int findMax(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("Maximum: " + findMax(a, b, c, d));
    }
}