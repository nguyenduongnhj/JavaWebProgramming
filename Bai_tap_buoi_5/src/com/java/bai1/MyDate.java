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
public class MyDate {
    
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        this.day = input.nextInt();
        System.out.print("Nhap thang: ");
        this.month = input.nextInt();
        System.out.print("Nhap nam: ");
        this.year = input.nextInt();
    }
    
    
    public boolean checkLeapYear(){
        if(year % 400 == 0){
            return true;
        }
        else if(year % 100 == 0){
            return false;
        }
        else if(year % 4 == 0){
            return true;
        }
        return false;
    }
    public boolean checkDate(){
        
        if(checkLeapYear() == true){
            if(month == 2){
                if(day <= 0 || day >29)
                    return false;
            }
        }
        else{
            if(month == 2){
                if(day <= 0 || day >28){
                    return false;
                }
            }
        }
        if(month <=0 || month > 12){
            return false;
        }
        
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if (day <= 0 || day > 31) {
                return false;
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day <= 0 || day >30) {
                return false;
            }
        }
        return true;
    }
    
    public void ShowDate(){
        int chose;
        while(checkDate() == false){
            System.out.println("Ngay thang nam nhap vao khong hop le !!!");
            System.out.println("Nhap lai: ");
            input();
            checkDate();
        }
        
        System.out.println("0: In ngay dang ngan !!!");
        System.out.println("1: In ngay dang dai !!!");
        System.out.print("Nhap dang muon in ra: ");
        Scanner input = new Scanner(System.in);
        chose = input.nextInt();
        
        switch(chose){
            case 0: System.out.println(day + "/" + month + "/" + year);break;
            case 1: System.out.println("Ngay " + day + " thang " + month + " nam " + year);break;
            default:System.out.println("So vua nhap khong hop le !!!");break;
        }
        
    }
    
    public void addDate(){
        int chose, add1, add2, add3;
        
        System.out.println("0: cong ngay.");
        System.out.println("1: cong thang.");
        System.out.println("2: cong nam");
        System.out.println("3: cong ngay va thang");
        System.out.println("4: cong ngay va nam");
        System.out.println("5: cong thang va nam");
        System.out.println("6: cong ca ngay, thang va nam");
        System.out.print("Ban muon cong theo kieu nao ?: ");
        Scanner input = new Scanner(System.in);
        chose = input.nextInt();
        
        switch(chose){
            case 0:
                System.out.print("Nhap so ngay muon cong them: ");
                add1 = input.nextInt();
                addDay(add1);
                break;
            case 1:
                System.out.print("Nhap so thang muon cong them (tru di)");
                add2 = input.nextInt();
                addMonth(add2);
                break;
            case 2:
                System.out.print("Nhap so nam muon cong them: ");
                add3 = input.nextInt();
                addYear(add3);
                break;
            case 3:
                System.out.print("Nhap so ngay muon cong them: ");
                add1 = input.nextInt(); 
                System.out.print("Nhap so thang muon cong them (tru di)");
                add2 = input.nextInt();
                addDay(add1);
                addMonth(add2);
                break;
            case 4:
                System.out.print("Nhap so ngay muon cong them: ");
                add1 = input.nextInt();
                System.out.print("Nhap so nam muon cong them: ");
                add3 = input.nextInt();
                addDay(add1);
                addYear(add3);
                break;
            case 5:
                System.out.print("Nhap so thang muon cong them (tru di)");
                add2 = input.nextInt();
                System.out.print("Nhap so nam muon cong them: ");
                add3 = input.nextInt();
                addMonth(add2);
                addYear(add3);
                break;
            case 6:
                System.out.print("Nhap so ngay muon cong them: ");
                add1 = input.nextInt(); 
                System.out.print("Nhap so thang muon cong them (tru di)");
                add2 = input.nextInt();
                System.out.print("Nhap so nam muon cong them: ");
                add3 = input.nextInt();
                addDay(add1);
                addMonth(add2);
                addYear(add3);
                break;
            default:
                System.out.println("So nhap vao khong hop le!!!");
                System.out.println("Chuong trinh ket thuc!!!");
                break;
        }
    }
    
    public void addYear( int year){
        
        this.year += year;
    }

    
    public void addMonth(int month){
        
        this.month += month;
        if (this.month > 12) {
            int years = this.month % 12;
            this.addYear(years);
            this.month = this.month / 12;
        }
    }
    public void addDay(int add){
        this.day += day;

        switch (this.month) {
            case 2:
                if (this.checkLeapYear()) {
                    if (this.day >= 29) {
                        this.addMonth(1);
                        int diff = this.day - 29;
                        this.day = 0;
                        this.addDay(diff);
                    }
                } else {
                    if (this.day >= 28) {
                        this.addMonth(1);
                        int diff = this.day - 28;
                        this.day = 0;
                        this.addDay(diff);
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (this.day > 31) {
                    this.addMonth(1);
                    int diff = this.day - 31;
                    this.day = 0;
                    this.addDay(diff);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.day > 30) {
                    this.addMonth(1);
                    int diff = this.day - 30;
                    this.day = 0;
                    this.addDay(diff);
                }
                break;
        }
    }
    
    
    
    
    
    
    
    
    
}