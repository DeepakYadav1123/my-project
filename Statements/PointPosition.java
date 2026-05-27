package Statements;

import java.util.Scanner;

public class PointPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point is at Origin");
        } else if (x == 0) {
            System.out.println("Point is on Y-axis");
        } else if (y == 0) {
            System.out.println("Point is on X-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Point is in 1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Point is in 2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Point is in 3rd Quadrant");
        } else {
            System.out.println("Point is in 4th Quadrant");
        }

        sc.close();
    }
}