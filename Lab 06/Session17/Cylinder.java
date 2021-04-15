package Session17;

import Session16.Circle_Re_produced;

public class Cylinder extends Circle_Re_produced {
    private double height;

    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
