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
public class Camera extends Product {

    private boolean hasWifi;

    public Camera() {
    }
    
    public Camera(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    @Override
    public void addNew() {
        Scanner input = new Scanner(System.in);
        super.addNew();
        System.out.print("SmartPhone has Wifi? (Y/N): ");
        String choice = input.nextLine();
        this.hasWifi = ("y".equals(choice) || "Y".equals(choice));
    }

}
