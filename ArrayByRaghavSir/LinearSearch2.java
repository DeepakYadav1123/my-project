package ArrayByRaghavSir;

public class LinearSearch2{
    public static void main(String[] args) {
        int[] arr = {12,3,27,53,18,62,88,6};
        int target = 6;
        boolean flag = false;
        for( int i=0; i<arr.length;i++){
            if(arr[i]== target){
                flag = true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Target exists in Array");
        }else{
            System.out.println("Target missing in Array");
        }
    }
    
}
