package ArrayByRaghavSir;

class MissingArray {
    int missingNum(int arr[]) {
        long n = arr.length + 1;
        long sum = n * (n + 1) / 2;

        long arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }

        return (int)(sum - arraySum);
    }

    public static void main(String[] args) {
        MissingArray obj = new MissingArray();
        int[] arr = {1, 2, 4, 5};
        System.out.println(obj.missingNum(arr));
    }
}