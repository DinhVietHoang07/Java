package Lab09;

public class Food extends Animal{
    private int mass;

    public Food (int mass){
        this.mass=mass;
    }

    @Override
    public String toString() {
        return "Food{" +
                "mass=" + mass +
                '}';
    }
}
