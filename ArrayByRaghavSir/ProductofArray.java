package ArrayByRaghavSir;

public class ProductofArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int product = 1;
        
        for(int i = 0; i < arr.length; i++){
            product *= arr[i];
        }
        
        System.out.println(product);
    }
}