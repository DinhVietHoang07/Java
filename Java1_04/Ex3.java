package Java1_04;

public class Ex3 {
    public static void main(String[] args) {


        char c1 = '0';   // Code number 48
        char c2 = 'A';   // Code number 65
        char c3;

        // char + char -> int + int ->
        // c3 = c1 + 5;                     // error: RHS evaluated to "int", cannot assign to LHS of "char"
        c3 = (char) (c1 + 5);                // Need explicit type casting, return char '5' (code number 53)
        System.out.println(c3);              //Print '5', as c3 is a char
        System.out.println(c1 + 5);         // Print int 53

        // Print the code number for 'a' to 'z'
        for (int codeNum = 'a'; codeNum <= 'z'; ++codeNum) {
            System.out.println((char) codeNum + ": " + codeNum);
        }

    }
}

