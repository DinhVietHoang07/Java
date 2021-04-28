package ADF1;

import java.util.Scanner;

public class TestBank  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The amount you owe the bank: ");
        double bal = scan.nextDouble();
        System.out.println("Balance is: ");
        double rate = scan.nextDouble();
        System.out.println("Rate is: ");

        Bank b1 = new Bank(bal, rate);
        System.out.println("$" + bal);
        System.out.println("$" + rate);
        System.out.printf("Interest : $%.2f%n", b1.calculateInterest());
    }
}
