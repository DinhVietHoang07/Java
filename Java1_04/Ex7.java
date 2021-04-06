package Java1_04;

public class Ex7 {
    public static void main(String[] args) {
        String str = "Fave is cool!";
        System.out.println(str.length());      // return int 13
        System.out.println(str.charAt(2));     // return char 'v'
        System.out.println(str.charAt(5));    // return char 'i'

        // comparing two String
        String anotherStr =" Jave is COOL!";
        System.out.println(str.equals(anotherStr));           // return boolean false
        System.out.println(str.equalsIgnoreCase(anotherStr)); // return boolean true
        System.out.println(anotherStr.equals(str));           // return boolean false
        System.out.println(anotherStr.equalsIgnoreCase(str)); // return boolean true
        // ( str == anotherStr) to compare two String is WRONG !!!
    }
}
