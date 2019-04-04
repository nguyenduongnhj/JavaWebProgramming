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
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int c, d;
        StudentManager manager = new StudentManager();

        do {
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Danh sach");
            System.out.println("3. TOP 3");
            System.out.println("4. Thoat");
            System.out.print("Chon : ");
            c = input.nextInt();
            switch (c) {
                case 1:
                    manager.input();
                    break;
                case 2:
                        manager.list();
                        break;
                case 3:
                    manager.showTop(d);
                    break;
                case 4:
                    System.exit(0);

            }
        } while (true);
    }

}
