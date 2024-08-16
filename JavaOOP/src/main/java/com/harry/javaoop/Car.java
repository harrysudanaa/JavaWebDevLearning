/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.javaoop;

/**
 *
 * @author Harry
 */
public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("Move in Car Class");
    }
    
    public void behaviourSpecificToCar() {
        System.out.println("Method behaviour");
    }
    
}
