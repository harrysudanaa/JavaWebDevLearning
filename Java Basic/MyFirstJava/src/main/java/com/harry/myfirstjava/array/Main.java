/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.myfirstjava.array;

/**
 *
 * @author Harry
 */
public class Main {
    public static void main(String[] args) {
        ArrayType myArray = new ArrayType();
        myArray.oneDimensionalArray();
        myArray.multiDimensionalArray();
        
        // create array of char
        char[] source = {'H', 'A', 'P', 'P', 'Y'};
        char[] destination = new char[3];
        
        // copy elements
        System.arraycopy(source, 0, destination, 1, 2);
        System.out.println(new String(destination));
        
        // delete element from array
        int flag = 3; // element to be deleted
        for (int i = 0; i < source.length; i++) {
            if (flag == i) {
                for (int j = i + 1; i < source.length - 1; j++) {
                    source[i] = source[j];
                    i++;
                }
                System.out.println(source);
            }
        }
        
    }
}
