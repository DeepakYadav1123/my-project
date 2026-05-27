package LoopRaghav;

import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter No: ");
        int n = sc.nextInt();
sc.close();
        for(int i = 2; i <= 3*n - 1; i += 3) {
            System.out.println(i);
        }

        sc.close();
    }
}