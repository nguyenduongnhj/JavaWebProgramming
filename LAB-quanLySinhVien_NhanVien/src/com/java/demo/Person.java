/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Person {
    
    private int id;
    private String name;
    
    public Scanner input = new Scanner(System.in);
    
    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    
    public void input(){
        System.out.print("ID      : ");
        this.id = Integer.parseInt(input.nextLine());
        System.out.print("Name    : ");
        this.name = input.nextLine();
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name;
    }
    
    
}
