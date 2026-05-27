package Vector;

import java.util.ArrayList;

public class Arraylist {
        public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(25);
        arr.add(26);
        arr.add(27);
        arr.add(28);
        arr.add(29);

        System.out.println(arr.get(2)); 
        arr.set(3,50);
        System.out.println(arr);
    }
    
}
