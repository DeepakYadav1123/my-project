package Operators;

import java.util.Scanner;
public class Ternary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        int prasun = (n>=0) ? 100 : 0;
        System.out.println(prasun);
    }

    
}
