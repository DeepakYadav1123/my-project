import java.util.Scanner;

public class AddTwoNum {
    static int add(int x, int y){
        int ans = x + y;
        return ans;
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();


        int ans = add(x, y);

        System.out.print("Sum of input numbers is: ");
        System.out.println(ans);
        sc.close();

    }
}
