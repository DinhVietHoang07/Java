package Java2_02.Ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MovieList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("The Shawshank Redemption");
        names.add("The Godfather");
        names.add("Pulp Fiction ");
        names.add("The Dark Knight");

        // Sửa Tên và Xóa
        System.out.println("List movie: " + names);

        names.set(3, "Titanic");

        System.out.println("Edits Fim: " + names);

        names.remove(2);
        System.out.println("Remove Movie : " + names);

        names.add(2, "Avatar");
        System.out.println("Add a Name movie: " + names);

        String movienew = names.get(1);
        System.out.println("The movie like: " + movienew);


    }
}
