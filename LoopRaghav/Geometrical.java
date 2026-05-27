package LoopRaghav;

import java.util.Scanner;
public class Geometrical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Term: ");
        int n = sc.nextInt();
        sc.close();
        int a = 1, r = 2;
        for(int i=1; i<=n; i++){
              System.out.println(a);
        a *= r;

        }
      
    }
    
}
