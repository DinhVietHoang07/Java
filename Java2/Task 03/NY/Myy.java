package Java2_02.Ex.NY;



import java.util.ArrayList;

public class Myy {
    private static String myNumber;
    private ArrayList<Ohh> myOhh;


    public Myy(String myNumber){
        this.myNumber = myNumber;
        this.myOhh= new ArrayList<Ohh>();
    }
    public static boolean addNewOhh(Ohh ohh){
        if(findOhh(ohh.getName()) >= 0){
            System.out.println("Ohh is already on file");
            return false;
        }
        myOhh.add(ohh);
        return true;
    }
    public static boolean updateOhh(Ohh oldOhh, Ohh newOhh) {
        int foundPosition = findOhh(oldOhh);
        if (foundPosition < 0) {
            System.out.println(oldOhh.getName() + ", was not found.");
            return false;
        }
       this.myOhh.set(foundPosition, newOhh);
        System.out.println(oldOhh.getName() + ", was replaced with" + newOhh.getName());
        return true;
    }
    public boolean removeOhh(Ohh ohh){
        int foundPosition = findOhh(ohh);
        if (foundPosition < 0 ){
            System.out.println(ohh.getName()+ ", was not found.");
            return false;
        }
        this.myOhh.remove(foundPosition);
        System.out.println(ohh.getName()+ ", was deleted.");
        return true;
    }
    private static int findOhh(Ohh ohh){
        return this.myOhh.indexOf(myOhh);
    }
    private int findContact(String ohhName){
        for (int i = 0; i < this.myOhh.size(); i++) {
            Ohh ohh = this.myOhh.get(i);
            if (ohh.getName().equals(ohhName)) {
                return i;
            }
        }
        return -1;
    }
    public Ohh queryOhh(Ohh ohh) {
        if (findOhh(ohh) >= 0) {
            return ohh.getName();
        }
        return null;
    }
    public static Ohh queryOhh(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myOhh.get(position);
        }
        return null;
    }
    public static void printOhh(){
        System.out.println("Contact List " + myNumber);
        for (int i = 0; i < this.myOhh.size(); i++){
            System.out.println((i + 1) + "." + this.myOhh.get(i).getName() + " -> "+ this.myOhh.get(i).getCharacter());
        }
    }
}
