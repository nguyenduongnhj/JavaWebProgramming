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
public class Student {
    private String id;
    private String name;
    private double mark;
    private int group;
    private String phone;

    public Student() {
    }

    public Student(String id, String name, double mark, String phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.phone = phone;
        cal(mark);
    }

    public Student(String id, String name, double mark, int group, String phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.group = group;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return   "id = " + id + ", name = " + name + ", mark = " + mark + ", group = " + group + ", phone = " + phone;
    }
    
    public void cal(double mark){
        if(mark >= 8){
            this.group = 1;
        }
        else if(mark  >= 6){
            this.group = 2;
        }
        else if(mark >=4 ) {
            this.group = 3;
        }
        else{
            this.group = 4;
        }
    } 
    
    
}
