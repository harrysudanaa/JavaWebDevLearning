/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.javaoop;

/**
 *
 * @author Harry
 */
public class Vehicle {
    Integer numberOfWheels = 4;
    Long mileage;
    
    Vehicle() {
        final Integer numberOfWheels;
        System.out.println("constructor of  super class vehicle");
    }
    
    public void move() {
        System.out.println("Move in vehicle class");
    }
}
