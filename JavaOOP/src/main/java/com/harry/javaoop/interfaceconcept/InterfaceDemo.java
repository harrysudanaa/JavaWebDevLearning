/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.javaoop.interfaceconcept;

/**
 *
 * @author Harry
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        float areaOfRectangle = rectangle.area();
        System.out.println("Area of rectangle " + areaOfRectangle);
        Shape.testStatic();
    }
}
