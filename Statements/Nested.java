package Statements;

import java.util.Scanner;
public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd No ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd No: ");
        int c = sc.nextInt();
        sc.close();
        if(a>=b){
if(a>=c)
    System.out.println(a);
else
    System.out.println(c);
        }else{      
            if(b>=c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
    
}
