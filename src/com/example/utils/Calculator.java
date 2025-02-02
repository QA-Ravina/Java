package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle myCircle = new Circle(4,2);
        Rectangle Rect = new Rectangle(5,4);


        double CirArea = Math.PI * Math.pow(myCircle.getRadius(), 2) ;
        int RectArea = Rect.getLength() * Rect.getBreadth();

        System.out.println("Area of Circle: " + CirArea + "Area of Rectangle: " + RectArea);
    }


}
