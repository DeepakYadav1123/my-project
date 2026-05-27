package LoopRaghav;
import java.util.Scanner;
public class Arithmatic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter Term: ");
        int n = sc.nextInt();
       int a = 2, d = 3;
        sc.close();
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a += d;
        }
    }
    
}
