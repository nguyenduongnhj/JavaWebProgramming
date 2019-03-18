/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Store {

    private static final int max = 30;
    private Product[] products;
    private int currQuantity;
    SmartPhone sm = new SmartPhone();
    Camera cmr = new Camera();
    Scanner input = new Scanner(System.in);

    public Store() {
        this.products = new Product[max];
        this.currQuantity = 0;
    }

    public boolean add(Product p) {
        if (currQuantity < max) {
            this.products[this.currQuantity] = p;
            this.currQuantity++;
            return true;
        } else {
            return false;
        }
    }

    public void addProduct() {
        int choice;
        System.out.println("1. Nhap san pham smartphone");
        System.out.println("2. Nhap san pham camera");
        System.out.print("Choice: ");
        choice = input.nextInt();

        boolean add = false;
        switch (choice) {
            case 1: {
                sm.addNew();
                if (currQuantity < max) {
                    this.products[this.currQuantity] = sm;
                    this.currQuantity++;
                    add = true;
                }
                break;
            }
            case 2: {
                cmr.addNew();
                if (currQuantity < max) {
                    this.products[this.currQuantity] = cmr;
                    this.currQuantity++;
                    add = true;
                }
                break;
            }
            default: {
                System.out.println("So nhap vao khong hop le");
                break;
            }
        }
        if (!add) {
            System.out.println("Them san pham that bai!!!");
        } else {
            System.out.println("Them thanh cong!!!");
        }
    }
    
    public void listProduct(){
        
        boolean found = false;
        
        for (Product p : products) {
            if(p == null)
                continue;
            else{
                System.out.println(p);
                found = true;
            }
        }
        if(!found){
            System.out.println("Khong tim thay!!!");
        }
    }
    public void search(String name){
        boolean found = false;
        for(Product p : products){
            if(p == null)
                continue;
            if(p.getName().equals(name)){
                System.out.println(p);
                found = true;
            }
        }
        if(!found){
            System.out.println("Khong tim thay!!!");
        }
    }
    
    
    
    
    
    

}
