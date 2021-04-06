package Java1_04;

public class Ex2 {
    public static void main(String[] args) {
        char c1 = '0';   // Code number 48
        char c2 = 'A';   // Code number 65
        char c3;

        // char + char -> int + int ->
        // c3 = c1 + c2;                     // error: RHS evaluated to "int", cannot assign to LHS of "char"
        c3 = (char) (c1 + c2);                // Need explicit type casting, return char 'q' (code number 113)
        System.out.println(c3);              //Print 'q', as c3 is a char
        System.out.println(c1 + c2);         // Print int 113
        System.out.println((char)(c1 + c2)); // Print char 'q'

    }
}