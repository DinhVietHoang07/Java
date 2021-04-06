package Java1_04;

import java.util.Arrays;

public class Ex31 {
    public static void main(String[] args){
        int[] testArray = {9, 5, 6, 1, 4};
        System.out.println("In caller, before calling the method, array is: "+ Arrays.toString(testArray));
    }

    public static void increment(int[] array){
        System.out.println("Inside method, before operation, array is "+ Arrays.toString(array));
    }
}
