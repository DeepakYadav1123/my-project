package ArrayByRaghavSir;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        
        int[] deep = Arrays.copyOf(arr, arr.length); // deep copy
        
        deep[0] = 100;
        
        System.out.println(deep[0]);
        System.out.println(arr[0]);
    }
}