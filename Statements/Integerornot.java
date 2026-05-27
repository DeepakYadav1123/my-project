package Statements;


import java.util.Scanner;
public class Integerornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        sc.close();
        int x = (int)n;
        if(n-x==0) {
            System.out.println("Not an Integer"); 
        } else {
            System.out.println("Is an Integer");
        }

    }
    
}
