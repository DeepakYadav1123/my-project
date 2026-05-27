package Statements;

import java.util.Scanner;
public class PerimeterandRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int length = sc.nextInt();
        System.out.print("Enter Number: ");
        int breadth = sc.nextInt();
        sc.close();
        int area = length*breadth;
        int perimeter = 2 * (length*breadth);
        if(area > perimeter){
            System.out.println("Area is hreater than perimeter");

        } else {
            System.out.println("Area is not greater than perimeter");
        }
    }
    
}
