package TEST;

import java.util.Scanner;

public class TestTicket {
    public static void main(String[] args) {
        double date;
        double time;

        System.out.println("Enter departure date (mm dd yyyy): ");
        Scanner scan = new Scanner(System.in);
        date = scan.nextDouble();
        System.out.println("Enter departure time(hh mm):");
        time = scan.nextDouble();

        // Displaying the value of the variables.R
        System.out.println("Enter the type of cabin:");
        System.out.println("1. Business");
        System.out.println("2. First");
        System.out.println("3. Economy");
        System.out.printf("Enter the number of tickets:");
        System.out.printf("Following is the information about the ticket(s) booked:");
        System.out.println("--------------------------------------------------------");

    }
}
