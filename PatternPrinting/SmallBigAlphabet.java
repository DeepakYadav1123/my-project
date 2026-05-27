package PatternPrinting;

import java.util.Scanner;

public class SmallBigAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            char ch;
            if (i % 2 == 1) {
                ch = (char) (96 + i);
            } else {
                ch = (char) (64 + i);
            }
            for(int j = 1; j<=n; j++){
            System.out.print(ch + " ");
        }
        System.out.println();
        }
        

    }

}
