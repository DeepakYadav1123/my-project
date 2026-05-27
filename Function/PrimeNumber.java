package Function;

public class PrimeNumber {

    // function to check prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // function to print primes till n
    public static void printPrimeNumber(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // moved inside method
    }

    public static void main(String[] args) {
        printPrimeNumber(20);
    }
}