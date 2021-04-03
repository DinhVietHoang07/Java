import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i == n) {
                    if (j == 0 || j == n)
                        System.out.print("+");
                    else
                        System.out.print("-");

                } else {
                    if (j == 0 || j == n)
                        System.out.print("|");
                    else {
                        if (j == n - i || i == j)
                            System.out.printf("3");
                        else if (i < j && j < n - i && i < 4 || i > j && j > n - i && i > 4)
                            System.out.printf(".");
                        else
                            System.out.printf(" ");
                    }
                }
            }
            System.out.println("");

        }
    }
}