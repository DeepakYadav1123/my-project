package ArrayByRaghavSir;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Reverse logic
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Print array (same style as you used)
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}