package com.example.geometry;

public class Circle {

   private double radius;
   private int diameter;


    public Circle(int diameter, int radius) {
        this.diameter = diameter;
        this.radius = radius;
    }

    public double getRadius(){
       return this.radius;
   }

}
