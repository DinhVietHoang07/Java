package Java1_04;

public class Ex9 {
    public static void main(String[] args) {
        String inStr = "5566";
        int number = Integer.parseInt(inStr);  // number <-5566
        // Input to Integer.parseInt() must be a valid integer literal
        // number + Integer.parseInt("abc");   // Runtime Error: NumberFormatException
    }
}
