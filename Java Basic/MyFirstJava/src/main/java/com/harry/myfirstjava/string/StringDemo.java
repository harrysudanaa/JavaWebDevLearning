/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.myfirstjava.string;

/**
 *
 * @author Harry
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "My Str";
        String s2 = "Your Str";
        
        System.out.println(s1.length());
        System.out.println(s1.substring(1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace("M", "N"));
        
    }
}
