package Lab08;

public class TestMonter {
    public static void main(String[] args) {
        Monster m1 = new FireMonter("r2u2");
        Monster m2 = new WaterMonter("u2r2");
        Monster m3 = new StoneMonter("r2r2");
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
        m1 = new StoneMonter("a2b2");
        System.out.println(m1.attack());

        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());
    }
}
