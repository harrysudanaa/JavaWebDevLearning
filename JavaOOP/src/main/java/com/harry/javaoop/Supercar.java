/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.javaoop;

/**
 *
 * @author Harry
 */
public class Supercar extends Car {
    public void turbo() {
        System.out.println("In turbo method");
    }
    
    public void changeWheels() {
        numberOfWheels = 4;
        behaviourSpecificToCar();
    }
}
