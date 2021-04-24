package Lab09.Session10;

class Ex09 extends Ex08{
    float area;
    @Override
    void calculate(float rad){
        area = getPI() * rad * rad;
        System.out.println("Area of circle is:"+ area);
    }
}
class Rectangle extends Ex08{
    float perimeter; // Variable to store perimeter value
    float length=10; // Variable to store length
    @Override
    void calculate(float width){
        perimeter = 2 * (length+width);
        System.out.println("Perimeter of the Rectangle is:"+ perimeter);
    }
}


