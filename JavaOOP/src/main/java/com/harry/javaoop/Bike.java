/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.javaoop;

/**
 *
 * @author Harry
 */
public class Bike extends Vehicle {
    
    Integer numberOfWheels;

    @Override
    public void move() {
        System.out.println("Move in Bike Class");
    }
    
    public void printNumberOfWheels() {
        numberOfWheels = 2;
        System.out.println(numberOfWheels);
        System.out.println(super.numberOfWheels);
    }
    
}
