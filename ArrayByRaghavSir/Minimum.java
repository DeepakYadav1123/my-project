package ArrayByRaghavSir;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {-6,8,14,-2,23,47,-7};
        int min= arr[0];
        for(int i= 0;i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}
