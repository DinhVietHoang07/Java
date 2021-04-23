package Lab08.Session19;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = (Shape) new Rectangle(1, 22);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());

        Lab08.Session19.Shape s2 = new Lab08.Session19.Triangle(3, 4);
        System.out.println(s2);
        System.out.println("Area is "+ s2.getArea());
    }
}
