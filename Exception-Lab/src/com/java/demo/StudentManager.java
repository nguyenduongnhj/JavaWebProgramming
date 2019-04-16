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
public class StudentManager extends Student{
    
    private static final int MAX_STUDENT = 30;
    private int curr;
    private Student[] listStudent;
    

    public StudentManager() {
        this.listStudent = new Student[MAX_STUDENT];
        this.curr = 0;
    }
    
    public boolean add() {
        System.out.println("-----ADD STUDENT-----");
        System.out.println("");
        input i = new input();
        System.out.print("Name = ");
        String name = i.addName();
        System.out.print("Id = ");
        String id = i.addId();
        System.out.print("Phone = ");
        String phone = i.addPhone();
        System.out.print("Mark = ");
        double mark = i.addMark();
        Student s = new Student(id, name, mark, phone);
        
        if(this.curr < this.MAX_STUDENT){
            this.listStudent[this.curr] = s;
            this.curr++;
            System.out.println("");
            System.out.println("SUCCESS!!!");
            System.out.println("");
            return true;
        }
        else{
            System.out.println("");
            System.out.println("FALSE!!!");
            System.out.println("");
            return false;
        }
    
    }
    
    public void listStudent() {
        System.out.println("-----LIST STUDENT-----");
        System.out.println("");
        for (int i = 0; i < this.curr; i++) {
            System.out.println(this.listStudent[i]);
        }
    }
    
    private void order(){
        Student temp = new Student();
        for (int i = 0; i < this.curr - 1; i++) {
            for (int j = 1; j < this.curr; j++) {
                if(this.listStudent[i].getMark() < this.listStudent[j].getMark()){
                    temp = this.listStudent[i];
                    this.listStudent[i] = this.listStudent[j];
                    this.listStudent[j] = temp;
                }
            }
        }
    }
    
    public void showTop(){
        this.order();
        System.out.println("------TOP 3-----");
        System.out.println("");
        if(this.curr < 3){
            for (int i = 0; i < this.curr; i++) {
                System.out.println(this.listStudent[i]);
            }
        }
        else{
            for (int i = 0; i < 3; i++) {
                System.out.println(this.listStudent[i]);
            }
        }
    }

}

