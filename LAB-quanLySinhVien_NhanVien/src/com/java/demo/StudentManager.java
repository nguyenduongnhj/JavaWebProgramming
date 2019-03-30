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
public class StudentManager extends Manager{
    
    private static final int MAX = 20;
    private int curr;
    private Student[] listStudent;

    public StudentManager() {
        this.listStudent = new Student[MAX];
        this.curr = 0;
    }

    @Override
    public boolean add() {
        Student s = new Student();
        s.input();
        if(this.curr < MAX){
            this.listStudent[curr] = s;
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
        for (Student st : listStudent) {
            if(st != null){
                System.out.println(st);
            }
        }
    }

    @Override
    public void search(String name) {
        boolean found = false;
        for (int i = 0; i < this.curr; i++) {
            if(this.listStudent[i].getName().equals(name)){
                System.out.println(this.listStudent[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Khong tim thay !!!");
        }
    }
    
}
