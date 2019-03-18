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
public class SmartPhone extends Product {

    private boolean hasCamera;
    private int sim;

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    

    public boolean isHasCamera() {
        return hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
    @Override
    public void addNew() {
        Scanner input = new Scanner(System.in);
        super.addNew();
        System.out.print("SmartPhone has camera? (Y/N): ");
        String choice = input.nextLine();
        this.hasCamera = ("y".equals(choice) || "Y".equals(choice));
        System.out.print("Nhap so dien thoai: ");
        sim = input.nextInt();
    }
    
}
