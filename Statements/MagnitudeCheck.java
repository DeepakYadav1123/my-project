package Statements;

import java.util.Scanner;

public class MagnitudeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        
        if (Math.abs(n) < 69) {
            System.out.println("Magnitude is smaller than 69");
        } else {
            System.out.println("Magnitude is NOT smaller than 69");
        }
    }
}
