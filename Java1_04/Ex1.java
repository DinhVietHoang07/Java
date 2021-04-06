package Java1_04;

public class Ex1 {
    public static void main(String[] args) {
        char c1 = '0';
        char c2 = 'A';
        char c3;

        // char <-> int (interchangeable)
        System.out.println((int) c1);   // Print int 48
        System.out.println((int) c2);   // Print 65
        c3 = 97;                       // Code number for 'a'
        System.out.println(c3);         // Print char 'a'
        System.out.println((char) 97);  // Print char 'a'
    }
}