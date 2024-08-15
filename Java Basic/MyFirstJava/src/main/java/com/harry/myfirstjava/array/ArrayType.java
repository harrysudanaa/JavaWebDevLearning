/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.myfirstjava.array;

/**
 *
 * @author Harry
 */
public class ArrayType {
    
    public void oneDimensionalArray() {
        int[] myArr = {1, 2, 3};
        System.out.println("This is one dimensional array on myArr[0] = " + myArr[0]);
    }
    
    public void multiDimensionalArray() {
        int[][] myArr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("This is multi dimensional array on myArr[0][2] = " + myArr[0][2]);
        System.out.println("Size of multidimensional array is " + myArr.length);
    }
}
