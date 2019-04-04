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
    
    private static final int MAX_STUDENT = 10;
    private Student[] students;
    private int count;
    
    public StudentManager() {
        this.students = new Student[MAX_STUDENT];
        this.count = 0;
    }
    
    public void input(){
        
        
        Input input = new Input();
        System.out.print("ID > ");
        String id = input.inputID();
        System.out.print("Name > ");
        String name = input.inputName();
        System.out.print("Mark > ");
        double mark = input.inputMark();
        System.out.print("Phone > ");
        String phone = input.inputPhone();
        
        Student s = new Student(id, name, mark, phone);
        this.students[this.count] = s;
        this.count++;
        
    }
    
     public void list() {
        System.out.println("---DANH SACH---");
        this.getOrderList();
        for (int i = 0; i < this.count; i++) {
            System.out.println(this.students[i]);
        }
    }
    
    public void showTop(int num) {
        Student[] arr = this.getOrderList();
        System.out.printf("----TOP %d----\n", num);
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }

    private Student[] getOrderList() {
        Student[] arr = this.students;
        for (int i = 0; i < this.count - 1; i++) {
            for (int j = i + 1; j < this.count; j++) {
                if (arr[i].getMark() < arr[j].getMark()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }   
        }
        return arr;
    }
    
    
}
