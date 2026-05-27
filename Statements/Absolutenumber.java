package Statements;

import java.util.Scanner;
public class Absolutenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n>=0) {
            System.out.println(n);
        } else {
            System.out.println(-n);
        }
    }
    
}
