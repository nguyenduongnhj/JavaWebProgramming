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
public class input{
    
    public Scanner input = new Scanner(System.in);

    public input() {
    }
    
    public String addName() {
        String tempName;
        
        try {
            tempName = input.nextLine();
            if(tempName.length() < 8) throw new Exception("Ten phai > 8 ki tu");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
            System.out.print("Nhap lai ten : ");
            return this.addName();
        }
        
        return tempName;
    }
    
    public String addId(){
        String tempId;
        
        try {
            tempId = input.nextLine();
            if(!tempId.startsWith("HV")) throw new Exception("ID phai bat dau bang HV va co 3 so");
            String sub = tempId.substring(2);
            int b = Integer.parseInt(sub);
            if(tempId.length() > 5) throw new Exception("ID khong duoc vuot qua 5 ki tu");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.print("Nhap lai Id : ");
            return this.addId();
        }
        
        return tempId;
    }
    
    public String addPhone() {
        String tempPhone;
        try {
            tempPhone = input.nextLine();
            int parseInt = Integer.parseInt(tempPhone);
            if(tempPhone.length() < 9 || tempPhone.length() > 13) throw new Exception("Do dai so dien thoai khong hop le!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.print("Nhap lai : ");
            return this.addPhone();
        }
        return tempPhone;
    }
    
    public double addMark() {
        double tempMark;
        try {
            tempMark = Double.parseDouble(input.nextLine());
            if(tempMark > 10 || tempMark < 0) throw new Exception("Diem nhap vao khong hop le ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.print("Nhap lai : ");
            return this.addMark();
        }
        return tempMark;
    }
    
}
