package While;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if(n<0)n = -n;
        int sum = 0;
        sc.close();
        while(n !=0){
            sum += (n%10);
            n /= 10;
        }
        // System.out.println((sum>0) ? sum : -sum);
        System.out.println(sum);
    }
}
