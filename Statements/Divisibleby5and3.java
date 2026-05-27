package Statements;

import java.util.Scanner;
public class Divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        if(n%5==0 && n%3==0){
            System.out.println("Brijesh");
        }else if(n%3==0){
            System.out.println("Puneet");
        }else if(n%5==0){
            System.out.println("Priyanshu");
        }else{
            System.out.println("Deepak");
        }
    }
    
}
