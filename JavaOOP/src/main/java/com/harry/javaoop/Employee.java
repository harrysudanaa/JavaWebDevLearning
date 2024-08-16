/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.harry.javaoop;

/**
 *
 * @author Harry
 */
public class Employee extends Manager{

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary =  100000;
        System.out.println("Salary of employee is " + emp.salary);
        
        Manager manager = new Manager();
        manager.salary = 200000;
        System.out.println("Salary of manager is " + manager.salary); 
    }
}
