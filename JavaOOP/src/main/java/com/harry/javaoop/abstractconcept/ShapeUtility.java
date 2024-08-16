/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.javaoop.abstractconcept;

/**
 *
 * @author Harry
 */
public class ShapeUtility {
    public static void main(String[] args) {
        Shape circle = new Circle();
        float areaOfCircle = circle.area();
        circle.displayArea(areaOfCircle);
    }
}
