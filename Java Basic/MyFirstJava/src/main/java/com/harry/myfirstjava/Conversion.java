/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.myfirstjava;

/**
 *
 * @author Harry
 */
public class Conversion {
    
    public void implicitConversion() {
        // char can be implicitly converted into int
        char c = 'a';
        int k = c;
        float f = c;
        long l = c;
        double d = c;
        System.out.println("Convert char c into int = " + k);
        System.out.println("Convert char c into float = " + f);
        System.out.println("Convert char c into long = " + l);
        System.out.println("Convert char c into double = " + d);
    }
    
    public void explicitConversion() {
        double d = 35.5;
        int i = (int)d;
        
        
        String s = "23";
        int num = Integer.parseInt(s);
        
        Integer myint = 10;
        String convToInt = Integer.toString(myint);
        
        System.out.println("Convert double = " + d + " into integer = " + i);
        System.out.println("Convert string = 23 "+ " into integer = " + num);
        System.out.println("Convert integer = " + myint + " into string = " + convToInt);
    }
    
}
