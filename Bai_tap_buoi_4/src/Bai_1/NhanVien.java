/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String name;
    private int yearOld;
    private String address;
    private double money;
    private int timeWork;
    
    public NhanVien() {
    }
    
    public NhanVien(String name, int yearOld, String address, double money, int timeWork){
        this.name = name;
        this.yearOld = yearOld;
        this.address = address;
        this.money = money;
        this.timeWork = timeWork;
    }
    
    public String getname(){
        return name;
    }
    
    public int getyearOld(){
        return yearOld;
    }
    
    public String getaddress(){
        return address;
    }
    public double getmoney(){
        return money;
    }
    
    public int gettimeWork(){
        return timeWork;
    }
    
    public void setname(){
        this.name = name;
    }
    
    public void setyearOld(){
        this.yearOld = yearOld;
    }
    
    public void setaddress(){
        this.address = address;
    }
    
    public void setmoney(){
        this.money = money;
    }
    
    public void settimeWork(){
        this.timeWork = timeWork;
    }
    
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ho, ten nhan vien: ");
        this.name = input.nextLine();
        System.out.print("Nhap tuoi cua nhan vien: ");
        this.yearOld = input.nextInt();
        System.out.print("Nhap dia chi nhan vien: ");
        this.address = input.nextLine();
        System.out.print("Nhap luong cua nhan vien: ");
        this.money = input.nextDouble();
        System.out.print("Nhap tong so gio lam cua nhan vien: ");
        this.timeWork = input.nextInt();
    }
    
    public void printInfo(){
        System.out.println("Ten cua nhan vien la: " + name);
        System.out.println("Tuoi cua nhan vien la: " + yearOld);
        System.out.println("Dia chi cua nhan vien la: " + address);
        System.out.println("Luong cua nhan vien la: " + money);
        System.out.println("Tong so thoi gian lam viec cua nhan vien la : " + timeWork);
    }
    
    public double tinhThuong(){
        double thuong = 0;
        if(timeWork >= 200){
            thuong = money * 0.2;
        }
        else if(timeWork >= 100 && timeWork <200){
            thuong = money * 0.1;
        }
        return thuong;
    }
    
    
        
    
    
    
    
    
    
    
}
