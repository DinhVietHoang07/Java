package Java2_02.Ex.NYC;


import Java2_02.Ex.NYC.ListBook;

import java.util.Scanner;

public class MainList{
    static ListBook pb = new ListBook() {
        @Override
        void insert(String name) {

        }
    };
    static Scanner scanner = new Scanner(System.in);
    static String name, phone;

    static void menu() {
        System.out.println("LIST LOVE");
        System.out.println("1. Insert ");
        System.out.println("2. Remove ");
        System.out.println("3. Update ");
        System.out.println("4. Search ");
        System.out.println("5. Sort");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        menu();
        while (true) {
            System.out.print("Please choose an option: ");
            switch (scanner.nextInt()) {
                case 1:
                    insert();
                    break;
                case 2:
                    remove();
                case 3:
                    update();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    sort();
                    break;
                case 6:
                    return;
            }
        }
    }

    private static void remove() {
        scanner.nextLine();
        System.out.print("Input name of person you want to remove: ");
        name = scanner.nextLine();
        pb.remove(name);
    }

    private static void search() {
        scanner.nextLine();
        System.out.print("Please input name of person you want to search: ");
        name = scanner.nextLine();
        pb.search(name);
    }

    private static void update() {
        boolean searched = false;
        scanner.nextLine();
        System.out.print("Input name of person you want to update: ");
        name = scanner.nextLine();
        for (String s : pb.List1) {
            if (name.equals(s.substring(0, s.indexOf(",")))) {
                searched = true;
                System.out.print("Input name, you want to update: ");
                phone = scanner.nextLine();
                pb.update(name, phone);
                break;
            }
        }
        if (!searched) System.out.println("Not found person with name is: " + name);
    }

    private static void sort() {
        pb.sort();
    }

    private static void insert() {
        scanner.nextLine();
        System.out.print("Input name: ");
        name = scanner.nextLine();
        System.out.print("Input phone: ");
        phone = scanner.nextLine();
        pb.insert(name, phone);
    }
}
