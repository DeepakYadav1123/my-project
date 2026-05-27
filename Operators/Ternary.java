package Operators;

import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println((n%2==0) ? "Even" : "Odd");
    }
    
}
  