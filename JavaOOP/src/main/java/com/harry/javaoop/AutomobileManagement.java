/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.javaoop;

/**
 *
 * @author Harry
 */
public class AutomobileManagement {
    public static void main(String[] args) {
        Car mercedes = new Car();
        Vehicle vehicle = mercedes;
        vehicle.move();
        
        
        Car bmw = new Car();
        mercedes.numberOfWheels =  4;
        
        Bike r1 =  new Bike();
        Bike ducati = new Bike();
        r1.numberOfWheels = 2;
        ducati.numberOfWheels = 2;
        
        bmw.move();
        
        ducati.printNumberOfWheels();
    }
}
