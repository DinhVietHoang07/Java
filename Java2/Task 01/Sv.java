package Java2_01.Ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Sv {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Le Van Dong");
        names.add("Tran Hai Hai");
        names.add("Le Le Minh");
        names.add("Luc Phi");

        // Sửa Tên và Xóa
        System.out.println("Edit and delete:\n ");
        System.out.println("Name class: " + names);

        names.set(3, "Vi thi Son");

        System.out.println("Name class after: " + names);

        names.remove(2);
        System.out.println("Name class after(2): " + names);

        // Them tên học sinh
        System.out.println("\nAdd a name:\n");
        System.out.println("Name new: " + names);
        names.add(2, "Le Le Le");
        System.out.println("New Name: " + names);

        System.out.println("Name after: ");
        for (String nameT : names) {
            System.out.println(nameT);
        }



        // In
        System.out.println("\nprint many styles: \n");
        System.out.println("\n=== Name using Java 8 forEach ===");
        names.forEach(name -> {
            System.out.println(name);
        });
        System.out.println("\n=== Name using an iterator() ===");
        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()){
            String name = nameIterator.next();
            System.out.println(name);
        }
        System.out.println("\n=== Name using a listIterator() to traverse in both directions ===");

        ListIterator<String> nameListIterator = names.listIterator(names.size());
        while (nameListIterator.hasPrevious()){
            String name = nameListIterator.previous();
            System.out.println(name);
        }

        System.out.println("\n=== Name using simple for-each loop ===");
        for (String name: names){
            System.out.println(name);
        }
        System.out.println("\n=== Name using for loop with index ===");
        for (int i = 1; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
