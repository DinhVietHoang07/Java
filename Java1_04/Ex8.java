package Java1_04;

public class Ex8 {
    public static void main(String[] args) {
        String str = "Java is cool!";
        System.out.println(str.length());                   // return int 13
        System.out.println(str.charAt(2));                 // return char 'v'
        System.out.println(str.substring(0, 3));             // return String "Jav"
        System.out.println(str.indexOf('a'));               // return int 1
        System.out.println(str.lastIndexOf('a'));           // return int 3
        System.out.println(str.endsWith("cool!"));          // return boolean true
        System.out.println(str.toUpperCase());              // return a new String "JAVA IS COOL!"
        System.out.println(str.toLowerCase());              // return a new String "java is cool!
    }
}
