/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.javaoop.abstractconcept;

/**
 *
 * @author Harry
 */
public abstract class Shape {
    
    abstract float area();
    
    public void displayArea(float area) {
        System.out.println("Printing area of a shape " + area);
    }
}
