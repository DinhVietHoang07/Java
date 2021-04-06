package Java1_04;

public class Ex10 {
    public static void main(String[] args) {
        String inStr = "55.66";
        float aFloat = Float.parseFloat(inStr);
        double aDouble = Double.parseDouble("1.2345");
        aDouble = Double.parseDouble("1.2e-3");
        // Input to Integer.parseInt() must be a valid double literal
        // number + Integer.parseDouble("abc");   // Runtime Error: NumberFormatException
    }
}
