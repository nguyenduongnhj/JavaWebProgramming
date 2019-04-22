/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Customer implements Serializable{
    
    private int id;
    private String name;
    private String address;
    private int age;

    public Customer() {
    }

    public Customer(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + ", address = " + address + ", age = " + age;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Id = ");
        this.id = Integer.parseInt(input.nextLine());
        System.out.print("Name = ");
        this.name = input.nextLine();
        System.out.print("Address = ");
        this.address = input.nextLine();
        System.out.print("Age = ");
        this.age = Integer.parseInt(input.nextLine());
    }
    
    
    
    
}
