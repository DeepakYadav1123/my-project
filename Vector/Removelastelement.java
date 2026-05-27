package Vector;

import java.util.ArrayList;

public class Removelastelement {
    
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(25);
        arr.add(26);
        arr.add(27);
        arr.add(28);
        arr.add(29);

        // Access element
        System.out.println(arr.get(2)); 

        // Update element
        arr.set(3, 50);
        System.out.println(arr);

        
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();

        
        arr.add(78);
        arr.add(1, 100);

        System.out.println(arr);

    
        arr.remove(arr.size() - 1);

        System.out.println("After removing last element: " + arr);
    }
}