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
public class Product {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addNew() {
        Scanner input = new Scanner(System.in);
        System.out.print("Name : ");
        this.name = input.nextLine();

        System.out.print("id : ");
        this.id = input.nextInt();

        System.out.print("Price : ");
        this.price = input.nextDouble();

        System.out.print("quantity : ");
        this.quantity = input.nextInt();
    }

    @Override
    public String toString() {
        return "Product{" + "id : " + id + ", name : " + name + ", price : " + price + ", quantity : " + quantity + '}';
    }
    
    
}
