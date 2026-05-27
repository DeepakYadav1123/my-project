package Function;

import java.util.Scanner;

public class HelloWorldd {

    public static void printHelloWorldd() {
        System.out.println("HelloWorldd");
        System.out.println("HelloWorldd");
        System.out.println("HelloWorldd");
    }

    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);   // fixed here
        System.out.println("sum is : " + sum);

        sc.close();
    }
}