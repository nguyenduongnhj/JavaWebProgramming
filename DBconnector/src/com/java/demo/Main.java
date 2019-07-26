/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            UserManager manager = new UserManager();
            String user = "";
            String pass = "";
            String name = "";
            int year, month, day;
            boolean gender = true;
            String email = "";
            Scanner input = new Scanner(System.in);
            System.out.print("user > ");
            user = input.nextLine();
            System.out.print("pass > ");
            pass = input.nextLine();
            System.out.print("Name > ");
            name = input.nextLine();
            System.out.print("email > ");
            email = input.nextLine();
            System.out.println("Year > ");
            year = Integer.parseInt(input.nextLine());
            System.out.println("month > ");
            month = Integer.parseInt(input.nextLine());
            System.out.println("day > ");
            day = Integer.parseInt(input.nextLine());

            boolean check = manager.createAccount(user, pass, name, gender, year, month, day, email);
            
            if (check) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
//            
//            boolean check = manager.login(user, pass);
//            if (check) {
//                System.out.println("Login success");
//            } else {
//                System.out.println("Login false");
//            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
