/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.myfirstjava;

/**
 *
 * @author Harry
 */
public class Rectangle extends Shape {

    @Override
    float area() {
        float h = 10;
        float calculateArea = h * h;
        System.out.println(calculateArea);
        return calculateArea;
    }
    
}
