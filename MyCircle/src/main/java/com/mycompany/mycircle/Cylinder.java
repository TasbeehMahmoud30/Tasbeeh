package com.mycompany.mycircle;
public class Cylinder extends Circle {
   private double height ;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }
     
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }

    
    
    public double getVolume() {
        return height*super.getArea();
    }
    
}
