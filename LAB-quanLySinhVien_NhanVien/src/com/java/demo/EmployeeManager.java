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
public class EmployeeManager extends Manager{
    private static final int MAX = 20;
    private int curr;
    private Employee[] listEmployee;

    public EmployeeManager() {
        this.listEmployee = new Employee[MAX];
        this.curr = 0;
    }

    @Override
    public boolean add() {
        Employee e = new Employee();
        e.input();
        if(this.curr < MAX){
            this.listEmployee[curr] = e;
            curr++;
            System.out.println("SUCCESS!!!");
            return true;
        }
        else{
            System.out.println("FALSE!!!");
            return false;
        }
        
    }

    @Override
    public void show() {
        for (Employee e : listEmployee) {
            if(e != null){
                System.out.println(e);
            }
        }
    }

    @Override
    public void search(String name) {
        boolean found = false;
        for (int i = 0; i < this.curr; i++) {
            if(this.listEmployee[i].getName().equals(name)){
                System.out.println(this.listEmployee[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Khong tim thay !!!");
        }
    }
}
