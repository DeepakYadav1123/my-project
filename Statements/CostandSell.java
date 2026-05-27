package Statements;
import java.util.Scanner;

public class CostandSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int cp = sc.nextInt();
        System.out.print("Enter SP: ");
        int sp = sc.nextInt();
        sc.close();

        if(sp > cp) {
            System.out.println("Profit");
        } else {
            System.out.println("Loss");
        }
    }
    
}
