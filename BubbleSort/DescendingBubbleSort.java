package BubbleSort;

public class DescendingBubbleSort {

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            boolean isSorted = true;

            for(int j = 0; j < n - 1 - i; j++) {

                // Change here: < for descending
                if(arr[j] < arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSorted = false;
                }
            }

            if(isSorted) break;
        }

        print(arr);
    }
}