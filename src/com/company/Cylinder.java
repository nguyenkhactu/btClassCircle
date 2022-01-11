package com.company;

public class Cylinder extends Circle {
    private double high;

    public Cylinder(double high) {
        this.high = high;
    }

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    public double getVolume(){
        return super.getArea() * high;
    }

    @Override
    public String toString() {
        return "Cylinder " +
                "high=" + high +
                super.toString() + "Volum = " + getVolume();
    }
}
