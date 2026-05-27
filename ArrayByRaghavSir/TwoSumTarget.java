package ArrayByRaghavSir;

public class TwoSumTarget {

    // Make method static so it can be called from main
    public static boolean twoSum(int arr[], int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return true;   // FIX: return when found
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Two Sum");

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        boolean result = twoSum(arr, target);
        System.out.println(result);
    }
}




