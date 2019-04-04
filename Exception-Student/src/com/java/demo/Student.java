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
    private String phone;
    private double mark;
    private int group;
    
    

    public Student() {
    }

    public Student(String id, String name, String phone, double mark, int group) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mark = mark;
        this.group = group;
    }
    
    public Student(String id, String name, String phone, double mark) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mark = mark;
        this.calGroup();
    }

    Student(String id, String name, double mark, String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void calGroup(){
        if(this.group >= 8){
            this.setGroup(1);
        }
        else if(this.group >= 6){
            this.setGroup(2);
        }
        else if(this.group >= 4){
            this.setGroup(3);
        }
        else{
            this.setGroup(4);
        }   
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    @Override
    public String toString() {
        return "Student{" + "id = "
                + id + 
                ", name = " 
                + name + 
                ", phone = "
                + phone + 
                ", mark = " 
                + mark + 
                ", group = "
                + group + '}';
    }

}
