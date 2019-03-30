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
public class Menu {
    
    private Manager manager = null;

    public Menu(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
    public void display(){
        Scanner input = new Scanner(System.in);
        int c = 0;
        
        while(c != 4) {
            System.out.println("=====MENU=====");
            System.out.println("1.  ADD");
            System.out.println("2.  Show");
            System.out.println("3.  Search");
            System.out.println("4.  Exit");
            System.out.print("Choice : ");
            c = Integer.parseInt(input.nextLine());
            
            switch(c){
                case 1:{
                    this.manager.add();
                    break;
                }
                case 2:{
                    this.manager.show();
                    break;
                }
                case 3:{
                    System.out.print("Name : ");
                    String name = input.nextLine();
                    this.manager.search(name);
                    break;
                }
                case 4:{
                    System.exit(0);
                }
                default:{
                    System.out.println("So nhap vao khong hop le !!!");
                    System.out.println("Chuong trinh ket thuc !!!");
                    System.exit(0);
                }
            }
            
        } 
        
        
        
        
    }
    
}
