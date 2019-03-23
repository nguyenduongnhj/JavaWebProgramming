/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bai1;

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
        int choice = 0;
        String order;
        Scanner input = new Scanner(System.in);

        Student st = new Student();
        StudentManager manager = new StudentManager();

        while (choice != 4) {
            System.out.println("---Student Manager---");
            System.out.println("1.   List");
            System.out.println("2.   Search");
            System.out.println("3.   Add");
            System.out.println("4.   Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Order (Y/N)");
                    order = input.nextLine();
                    if (order == "y" || order == "Y") {
                        System.out.println("ASC/DESC (A/D)");
                        order = input.nextLine();
                        if (order == "a" || order == "A") {
                            manager.list(true);
                        } else if (order == "d" || order == "D") {
                            manager.list(false);
                        }
                    } else if (order == "n" || order == "N") {
                        manager.list();
                    }
                    break;
                }
                case 2: {

                }
                case 3: {
                    st.input();
                    manager.add(st);
                    if (manager.add(st) == true) {
                        System.out.println("success!!!");
                    } else {
                        System.out.println("False");
                    }
                }
                case 4: {
                    break;
                }
                default: {
                    System.out.println("So nhap vao khong hop le!!!");
                    System.out.println("Chuong trinh ket thuc!!!");
                    choice = 4;
                    break;
                }

            }

        }

    }

}
