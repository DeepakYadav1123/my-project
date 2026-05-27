package Vector;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {

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

        // Print using normal loop
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        // Print using for-each loop (ONLY printing)
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();

        // Add elements (outside loop)
        arr.add(78);
        arr.add(1, 100);

        System.out.println(arr);

        // Remove last element
        arr.remove(arr.size() - 1);

        System.out.println("After removing last element: " + arr);

        // Manual Reverse (Two Pointer)
        int i = 0, j = arr.size() - 1;

        while(i < j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);

            i++;
            j--;
        }

        System.out.println("Reversed ArrayList: " + arr);

        // Optional: using Collections
        // Collections.reverse(arr);
        // System.out.println(arr);
    }
}