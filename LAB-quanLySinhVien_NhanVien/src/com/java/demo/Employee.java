/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

/**
 *
 * @author Admin
 */
public class Employee extends Person{
    private double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Salary  : ");
        this.salary = Double.parseDouble(input.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "salary = " + salary;
    }
    
    
    
    
    
    
    
    
}
