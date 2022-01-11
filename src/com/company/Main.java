package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(20,"red");
        System.out.println(circle);

        Cylinder cylinder =new Cylinder(20,"red",10) ;
        System.out.println(cylinder);
    }
}
