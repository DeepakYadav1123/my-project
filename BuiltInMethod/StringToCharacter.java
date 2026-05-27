package BuiltInMethod;

public class StringToCharacter {
    public static void main(String[] args) {
        String s = "Raghav";
        char[] arr = s.toCharArray();
        for(char ch : arr){
            System.out.println(ch);
        }
    }
    
}
