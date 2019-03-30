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
public class Student extends Person {

    private String email;

    public Student() {
    }

    public Student(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Email   : ");
        this.email = input.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", email = " + email;
    }

}
