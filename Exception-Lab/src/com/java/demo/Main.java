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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StudentManager manager = new StudentManager();
        int c;
        Scanner input = new Scanner(System.in);
        
        do {                     
            System.out.println("1. Nhap Thong Tin");
            System.out.println("2. Danh Sach");
            System.out.println("3. TOP 3");
            System.out.println("4. Thoat");
            System.out.print("Choice : ");
            c = input.nextInt();
            switch(c){
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.listStudent();
                    break;
                case 3:
                    manager.showTop();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ki tu nhap vao khong hop le!!!");
                    System.out.println("Chuong trinh ket thuc!");
                    System.exit(0);                  
            } 
        } while (true);
    }
    
}
