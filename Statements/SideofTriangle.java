package Statements;

import java.util.Scanner;
public class SideofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Side: ");
        int a = sc.nextInt();
         System.out.print("Enter 2nd Side: ");
        int b = sc.nextInt();
         System.out.print("Enter 3rd Side: ");
        int c = sc.nextInt();
        sc.close();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
    
}
