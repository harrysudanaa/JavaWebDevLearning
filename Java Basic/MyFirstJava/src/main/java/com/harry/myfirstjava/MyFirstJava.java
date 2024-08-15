/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.harry.myfirstjava;

/**
 *
 * @author Harry
 */

public class MyFirstJava {
    
    Integer instanceVariable = 120;
    static Integer staticVariable = 140;
    
    final Integer i = 10;
    
    private synchronized void nonStaticTest() {
        System.out.println("Non Static Method");
    }
    
    static void staticTest() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        MyFirstJava myJavaObject = new MyFirstJava();
        staticTest();
        myJavaObject.nonStaticTest();
        System.out.println(myJavaObject.i);
        
        AccessModifierTest accessModifier = new AccessModifierTest();
        accessModifier.nonStaticTest();
        
        System.out.println(myJavaObject.instanceVariable);
        staticVariable = 10;
        System.out.println(staticVariable);
        
        Rectangle myRectangle = new Rectangle();
        myRectangle.area();
        
        Conversion myConversion = new Conversion();
        myConversion.implicitConversion();
        myConversion.explicitConversion();
        
        OperatorType myOperatorType = new OperatorType();
        myOperatorType.unaryOperator();
        myOperatorType.arithmeticOperator();
        myOperatorType.shiftOperators();
        myOperatorType.relationalOperator();
        myOperatorType.assignmentOperator();
        myOperatorType.ternaryOperator();
        myOperatorType.logicalOperator();
        
        ControlStatement myControlStatement = new ControlStatement();
        myControlStatement.ifStatement();
        myControlStatement.ifElseStatement();
        myControlStatement.nestedIfStatements();
        myControlStatement.switchStatement();
        
        IterationStatement myIterationStatement = new IterationStatement();
        myIterationStatement.forLoop();
        myIterationStatement.whileLoop();
        myIterationStatement.doWhile();
    }
}
