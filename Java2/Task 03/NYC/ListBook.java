package Java2_02.Ex.NYC;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class ListBook extends Java2_02.Ex.NYC.List {

    List<String> List1 = new ArrayList();


    void insert(String name, String phone) {
        boolean timThay = false;
        for (String s : List1) {
            if (s.contains(name)) {
                timThay = true;
                if (!s.contains(phone)) {
                    s += " : " + phone;
                } else {
                    System.out.println("Ngáo à??");
                }
            }
        }
        if (!timThay) {
            List1.add(name + "," + phone);
        }
    }



    void remove(String name) {
        boolean searched = false;
        for (String s : List1) {
            if (name.equals(s.substring(0, s.indexOf(",")))) {
                searched = true;
                List1.remove(s);
                System.out.println("Removed");
                break;
            }
        }
        if (!searched) System.out.println("Xau tinh: " + name);
    }


    void update(String name, String newPhone) {
        String s = name;
        s = s.substring(0, s.indexOf(","));
        List1.set(List1.indexOf(s), s + "," + newPhone);
        System.out.println("Updated");
    }

    @Override
    void search(String name) {
        boolean searched = false;
        for (String s : List1) {
            if (s.contains(name)) {
                searched = true;
                System.out.println(s.toString());
                break;
            }
        }
        if (!searched) System.out.println("What do you do with your ex =))) ");
    }

    void sort() {
        if (List1.size() == 0) System.out.println("Ohh Noo");
        else {

            Collections.sort(List1, new Comparator<String>() {
                @Override
                public int compare(String s, String t1) {
                    return s.compareTo(t1);
                }
            });
            System.out.println("Sort Ascending by name:");
            for (String s : List1) {
                System.out.println(s);
            }

            Collections.sort(List1, new Comparator<String>() {
                @Override
                public int compare(String s, String t1) {
                    return t1.compareTo(s);
                }
            });
            System.out.println("Sort Descending by name:");
            for (String s : List1) {
                System.out.println(s);
            }
        }
    }
}

