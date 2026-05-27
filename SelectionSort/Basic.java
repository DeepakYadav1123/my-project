package SelectionSort;

public class Basic {

    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 1, 9, 2, 3, 2};
        int n = arr.length;

        print(arr);

        for(int i = 0; i < n - 1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = i;

            for(int j = i; j < n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        print(arr);
    }
}