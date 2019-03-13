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
        MyDate d = new MyDate();
        d.input();
        int chose;
        Scanner input = new Scanner(System.in);
        chose = input.nextInt();
        
        switch(chose){
            case 0:
                System.out.print("Nhap mot ngay thang nam moi !!!");
                MyDate date = new MyDate();
                date.input();
                break;
          
        }
        
        
        
        
        
        
        
        d.ShowDate();
        d.addDate();
        d.ShowDate();
        
        
        
        
    }
    
}
