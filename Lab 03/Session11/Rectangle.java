package Session11;

class Rectangle {
    private float length;
    private float width;

    public Rectangle (float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength () {
        return length;
    }
    public float getWidth () {
        return width;
    }
    public String getArea () {
        return "Area Rectangle is : " + length * width;
    }
    public String getPerimeter () {
        return "Perimeter Rectangle is : " + (length + width) * 2;
    }
    public void setLength (float length, float width) {
        this.length = length;
        this.width = width;
    }
    public String toString () {
        return length + " , " + width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.toString());
        System.out.println("---------------");
        r.setLength(9, 5);
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.toString());
    }

}

