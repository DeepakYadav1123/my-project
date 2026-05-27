package Statements;

import java.util.Scanner;

public class Fourdigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        sc.close();

        if(n > 999 && n < 10000) {
            System.out.println("4 Digit Number");
        } else {
            System.out.println("Not a 4 Digit Number");
        }
    }
}