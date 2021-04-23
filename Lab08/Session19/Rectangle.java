package Lab08.Session19;

public class Rectangle extends Shape_01 {
    private int length, width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}
