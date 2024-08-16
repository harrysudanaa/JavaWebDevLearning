/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.harry.javaoop.interfaceconcept;

/**
 *
 * @author Harry
 */
public interface Shape {
    abstract float area();
    static void testStatic() {
        System.out.println("Test Static Method");
    }
}
