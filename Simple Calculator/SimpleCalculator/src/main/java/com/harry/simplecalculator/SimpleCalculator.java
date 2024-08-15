/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.harry.simplecalculator;
import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class SimpleCalculator {
    
    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }
    
    public Integer substract(Integer num1, Integer num2) {
        return num1 - num2;
    }
    
    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
    
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
    
    public void numberOperation(Integer userInput) {
        Scanner myScanner = new Scanner(System.in);
        SimpleCalculator myCalc = new SimpleCalculator();
        
        Integer res;
        
        System.out.println("Enter first number: ");
        Integer firstNumber = myScanner.nextInt();
        
        System.out.println("Enter second Number: ");
        Integer secondNumber = myScanner.nextInt();
        
        switch (userInput) {
            case 1: {
                res = myCalc.add(firstNumber, secondNumber);
                System.out.println("The result is " + res);
                break;
            }
            case 2: {
                res = myCalc.substract(firstNumber, secondNumber);
                System.out.println("The result is " + res);
                break;
            }
            case 3: {
                res = myCalc.divide(firstNumber, secondNumber);
                System.out.println("The result is " + res);
                break;
            }
            case 4: {
                res = myCalc.multiply(firstNumber, secondNumber);
                System.out.println("The result is " + res);
                break;
            }
            default: System.out.println("Your input must be a number!");
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Simple Calculator Program \n Select operation");
        System.out.println("1. Addition\n 2. Substraction\n 3. Division\n 4. Multiplication");
        System.out.println("Enter your choice by number: ");
        
        Scanner myScanner = new Scanner(System.in);
        Integer userInput = myScanner.nextInt();
        SimpleCalculator myCalc = new SimpleCalculator();
        myCalc.numberOperation(userInput);
        
    }
}
