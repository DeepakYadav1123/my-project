package ArrayByRaghavSir;

public class MissingElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};

        int result = missingNum(arr);

        System.out.println("Missing number: " + result);
    }

    static int missingNum(int arr[]) {

        int n = arr.length + 1;

        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }

        return totalSum - arraySum;
    }
}