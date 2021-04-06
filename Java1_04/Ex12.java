package Java1_04;

public class Ex12 {
    public static void main(String[] args) {
        String boolStr = "true";
        boolean done = Boolean.parseBoolean(boolStr);    // done <- true
        boolean vaild = Boolean.parseBoolean("false"); // valid <- false
    }
}
