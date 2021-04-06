package Java1_04;
import java.util.Scanner;


public class Ex16 {
    public static void main(String[] args) {
        // Declare variable
        String inStr;  // input String
        int inStrLen;  //length of the input String
        Scanner in = new Scanner(System.in);

        // Prompt and read input as "String"
        System.out.print("Enter a String: ");
        inStr = in.next();
        inStrLen = inStr.length();

        System.out.print("The reverse is: ");
        // Use a for-loop to extract each char in reverse order
        for (int inCharIdx = inStrLen - 1; inCharIdx >= 0; --inCharIdx) {
            System.out.print(inStr.charAt(inCharIdx));
        }
        System.out.println();
        in.close();
    }
}
