package Function;

// calculate sum of two numbers
public class Parameter {

    public static int sum(int a, int b) {
        return a + b;
    }

    // calculate sum of three numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 2, 1));
    }
}