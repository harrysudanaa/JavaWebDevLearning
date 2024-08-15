/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.constructor;

/**
 *
 * @author Harry
 */
public class ConstructorDemo {
    int instanceVar;
    
    ConstructorDemo() {
        instanceVar = 100;
    }
    
    ConstructorDemo(int value1, int value2) {
        instanceVar = value1 + value2;
    }
    
    public Integer addNumber(Integer num1, Integer num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        ConstructorDemo myCons = new ConstructorDemo();
        ConstructorDemo myConsVal = new ConstructorDemo(2, 3);
        System.out.println(myCons.instanceVar);
        System.out.println(myConsVal.instanceVar);
    }
}
