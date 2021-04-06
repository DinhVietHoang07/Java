package Java1_04;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        // Declare variable
        int numItems;
        int[] items; // Declare array name, to be allocated after numItems is know
        Scanner in = new Scanner(System.in);

        // Prompt for a no-negative integer for the number of items;
        // and read the input as "int". No input validation.
        System.out.print("Enter the number of items: ");
        numItems = in.nextInt();

        //Allocate the array
        items = new int[numItems];

        // Prompt and read th items into the "int" array, only if array length > 0
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
        }

        //Print array contents, need to handle first item and subsequent items differently
        System.out.print("The value are: [");
        for (int i = 0; i < items.length; i++) {
            if ( i == 0) {
                // Print the first item without a leading commas
                System.out.print(items[0]);
            } else {
                // Print the subsequent items with a leading commas
                System.out.print(", " + items[i]);
            }
        }
        System.out.println("]");
        in.close();
    }
}
