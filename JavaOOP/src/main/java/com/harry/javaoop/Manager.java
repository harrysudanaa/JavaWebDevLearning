/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.javaoop;

/**
 *
 * @author Harry
 */
public class Manager {
    long salary;
    
    public void display(Integer dummyValueToBePrinted) {
        System.out.println("Printing integer value " + dummyValueToBePrinted);
    }
    
    public void display(String dummyValueToBePrinted) {
        System.out.println("Printing integer value " + dummyValueToBePrinted);
    }
    
    public static void main(String[] args) {
        Manager seniorManager = new Manager();
        seniorManager.display(100);
        seniorManager.display("Senior Manager Grade 2");
    }
}
