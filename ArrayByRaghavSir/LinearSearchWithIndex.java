package ArrayByRaghavSir;

public class LinearSearchWithIndex{
    public static void main(String[] args) {
        int[] arr = {12,3,27,53,18,62,88,6,53};
        int target = 10;
        int found = -1;
      
        for( int i=0; i<arr.length;i++){
            if(arr[i]== target){
                found = i;
                break;
            }
        }
        if(found!=-1){
            System.out.println("Target exists in Array at index"+found);
        }else{
            System.out.println("Target missing in Array");
        }
    }
    
}
