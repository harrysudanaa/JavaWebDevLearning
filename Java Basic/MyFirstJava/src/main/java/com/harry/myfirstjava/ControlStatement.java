/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.myfirstjava;

/**
 *
 * @author Harry
 */
public class ControlStatement {
    
    int a = 10;
    int b = 20;
    
    public void ifStatement() {
        if (a < b) {
            System.out.println("Running code inside if statement");
        }
        System.out.println("Running code after if statement");
    }
    
    public void ifElseStatement() {
        if (a < b) {
            System.out.println("The condition of if statement is true");
        } else {
            System.out.println("The condition of if statement is false");
        }
    }
    
    public void nestedIfStatements() {
        if (a < b) {
            System.out.println("The first condition is true");
            if (a > b) {
                System.out.println("The second condition is true");
            } else {
                System.out.println("The second condition is false");
            }
        } else {
            System.out.println("The first condition is false");
        }
    }
    
    public void switchStatement() {
        switch (a) {
            case 5: System.out.println("Case 5 executed");
            case 10: System.out.println("Case 10 executed");
            default: System.out.println("Case 5 and 10 is not executed");
        }
    }
    
}
