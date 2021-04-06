package Java1_04;

public class Ex17 {
    public static void main(String[] args) {
        int[] marks;  //Declare an int array named "marks"
                      // "marks" in assigned to a special value called "null" before allocation
        int mark []; // Same as above, but the above syntax recommended
        marks = new int[5];  // Allocate 5 element via the "new" operator
        // Declare and allocate a 20-element array in one statement via "new" operator
        int[] factors = new int[20];
        // Declare, allocate a 6-element array thru initialization
        int[] numbers = {11, 22, 33, 44, 55, 66};  // size of array deduced from the number of items
    }
}
