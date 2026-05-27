package Function;

public class Product {

    public static void printProduct() {
        System.out.println("This is product function");
    }

    // swap function
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // multiply function
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);

        // swap(a, b); // calling swap
    }
}