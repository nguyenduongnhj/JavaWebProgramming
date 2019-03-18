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
        int choice = 0;
        String name;
        Store st = new Store();
        Scanner input = new Scanner(System.in);
        while(choice != 4){
            System.out.println("1.   Add Product");
            System.out.println("2.   List Product");
            System.out.println("3.   Search");
            System.out.println("4.   Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            switch(choice){
                case 1:{
                    st.addProduct();
                    break;
                }
                case 2:{
                    st.listProduct();
                    break;
                }
                case 3:{
                    System.out.print("Name : ");
                    name = input.nextLine();
                    st.search(name);
                    break;
                }
                case 4:
                    System.out.println("Chuong trinh ket thuc");
                    break;
                default:{
                    System.out.println("So vua nhap khong hop le!!! ");
                    System.out.println("Chuong trinh ket thuc");
                    choice = 4;
                    break;
                }
4            }
            
        }
                
    }
    
}
