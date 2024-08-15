/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.myfirstjava;

/**
 *
 * @author Harry
 */
public class OperatorType {
    public void unaryOperator() {
        int x = 10;
        boolean a = true;
        System.out.println("value x before post increment = " + x + " and after post increment = " + x++);
        System.out.println("value x after pre decrement = " + --x);
        System.out.println("value a before use NOT operator = " + a + " and after use NOT operator = " + !a);
    }
    
    public void arithmeticOperator() {
        int x = 10;
        int y = 20;
        int add = x + y;
        int substract = x - y;
        int multiplication = x * y;
        int division = x / y;
        int remains = x % y;
        
        System.out.println("x + y = " + add);
        System.out.println("x - y = " + substract);
        System.out.println("x * y = " + multiplication);
        System.out.println("x / y = " + division);
        System.out.println("x % y = " + remains);
    }
    
    public void shiftOperators() {
        int x = 20;
        int shifting = x >> 2;
        System.out.println("x before shiting 2 to right = " + x +" and after shifting 2 to right = " + shifting);
    }
    
    public void relationalOperator() {
        int a = 10;
        int b = 20;
        boolean isAGreaterThanB = a > b;
        boolean isALessThanB = a < b;
        boolean isAEqualToB = a == b;
        
        System.out.println("value a = " + a + " and value b = " + b);
        System.out.println("is a > b? " + isAGreaterThanB);
        System.out.println("is a < b? " + isALessThanB);
        System.out.println("is a == b? " + isAEqualToB);
    }
    
    public void assignmentOperator() {
        int a = 20;
        int b = 40;
        System.out.println("value a = " + a);
        System.out.println("value b = " + b);
        a += b;
        System.out.println("value a += b = " + a);
    }
    
    public void ternaryOperator() {
        int a = 20;
        int b = 40;
        int ter = a < b ? 100 : 200;
        System.out.println("Check if a < b using ternary, if true = 100, if false = 200" + ter);
    }
    
    public void logicalOperator() {
        int a = 20;
        int b = 40;
        int c = 10;
        int ter = a < b ? 100 : 200;
        boolean check = a < b && c > ter;
        System.out.println("The result of check a < b && c > ter = " + check);
    }
}
