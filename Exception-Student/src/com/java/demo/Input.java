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
public class Input extends Exception{
    
    public Scanner input = new Scanner(System.in);

    public Input() {
    }
    
    public String inputID(){
        String tempId;
        try {
            System.out.print("ID : ");
            tempId = input.nextLine();
            if (!tempId.matches("HV[0-9]{3}")) 
                throw new Exception("Phai bat dau bang HV va 3 so!!!");
            
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputID();
        }
        return tempId;
    }
    
    public String inputName() {
        String tempName;
        try {
            System.out.print("Name : ");
            tempName = input.nextLine();
            if(tempName.length() < 8){
                throw new Exception("Do dai ten nhap vao khong hop le!!!");
            }
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputName();
        }
        return tempName;
    }
    
    public String inputPhone() {
        String tempPhone;
        try{
            System.out.print("Phone : ");
            tempPhone = input.nextLine();
            int parseInt = Integer.parseInt(tempPhone);
        } catch(NumberFormatException e){
            System.out.println("So dien thoai nhap vao chua ki tu khong hop le");
            System.out.println("Nhap lai!!!");
            return this.inputPhone();
        }
        if(tempPhone.length() < 10 || tempPhone.length() > 12){
            System.out.println("So dien thoai nhap vao khong hop le!!!");
            System.out.println("Nhap lai!!!");
            return this.inputPhone();
        }
        return tempPhone;
    }
    
    public double inputMark() {
        double tempMark;
        try {
            System.out.print("Mark : ");
            tempMark = Double.parseDouble(input.nextLine());
            
        } catch (NumberFormatException e) {
            System.out.println("Ki tu nhap vao khong hop le !!!");
            System.out.println("Nhap lai");
            return this.inputMark();
        }
        
        if(tempMark > 10 || tempMark < 0){
            System.out.println("Diem nhap vao khong hop le");
            System.out.println("Nhap lai");
            return this.inputMark();
        }
        
        return tempMark;
    }
    
    
}
