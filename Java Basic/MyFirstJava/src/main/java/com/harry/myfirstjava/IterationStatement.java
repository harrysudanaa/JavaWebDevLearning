/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.myfirstjava;

/**
 *
 * @author Harry
 */
public class IterationStatement {
    public void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " loop");
        }
        System.out.println("Loop ended");
    }
    
    public void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println("value i inside while loop " + i);
            i++;
        }
        System.out.println("Loop ended with value i = " + i);
    }
    
    public void doWhile() {
        int i = 10;
        do {
            System.out.println("value i inside do while loop = " + i);
            i--;
            
        } while (i > 0);
        
        System.out.println("Do while loop ended");
    }
 }
