package Lab08.Session19;


public class TestShape_01 {
    public static void main(String[] args) {
        Shape_01 s1 = new Rectangle(4,5);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());
        Triangle s2 = new Triangle( 4, 5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
        Shape_01 s3 = new Shape_01("green");
    }
}

