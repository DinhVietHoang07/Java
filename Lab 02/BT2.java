import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < (n/2+1); i++) {
            for (int j = 0; j <= n; j++) {
                if ((n / 2 - i) <= j && j <= (n/2+i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

