/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bai_3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {

    private String maSo;
    private float diem;
    private int tuoi;
    private String lop;
    private String dangkihoc;
    private String noiquy;

    public void setNoiquy(String noiquy) {
        this.noiquy = noiquy;
    }

    public String getNoiquy() {
        return noiquy;
    }

    public void setDangkihoc(String dangkihoc) {
        this.dangkihoc = dangkihoc;
    }

    public String getDangkihoc() {
        return dangkihoc;
    }

    public Student() {

    }

    public Student(String maSo, float diem, int tuoi, String lop) {

    }

    public String getmaSo() {
        return maSo;
    }

    public float getdiem() {
        return diem;
    }

    public int gettuoi() {
        return tuoi;
    }

    public String getlop() {
        return lop;
    }

    public void setmaSo() {
        this.maSo = maSo;
    }

    public void setdiem() {
        this.diem = diem;
    }

    public void settuoi() {
        this.tuoi = tuoi;
    }

    public void setlop() {
        this.lop = lop;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSo = input.nextLine();
        while (maSo.length() != 8) {
            System.out.println("Ma so nhap khong hop le!!!");
            System.out.println("Yeu cau ma so nhap vao du 8 ki tu!!!");
            System.out.print("Nhap lai ma: ");
            maSo = input.nextLine();
        }

        System.out.print("Nhap diem trung binh: ");
        diem = input.nextFloat();
        while (diem < 0 || diem > 10) {
            System.out.println("Diem nhap vao khong hop le!!!");
            System.out.print("Nhap lai diem: ");
            diem = input.nextFloat();
        }
        System.out.print("Nhap tuoi: ");
        tuoi = input.nextInt();
        while (tuoi < 18) {
            System.out.println("Tuoi nhap vao khong hop le!!!");
            System.out.print("Nhap lai tuoi: ");
            tuoi = input.nextInt();
        }

        System.out.print("Nhap lop: ");
        lop = input.nextLine();
        
        System.out.println("Sinh vien co dang ki khoa hoc HDSE khong? : Y/N");
        dangkihoc = input.nextLine();
        
        System.out.println("Sinh vien co vi pham noi quy khong? : Y/N ");
        noiquy = input.nextLine();
        
        
    }

    public void showInfo() {
        System.out.println("Ma so cua sinh vien la : " + maSo);
        System.out.println("Diem trung binh cua sinh vien la : " + diem);
        System.out.println("Tuoi cua sinh vien la: " + tuoi);
        System.out.println("Lop cua sinh vien la: " + lop);
    }

    public boolean checkhb() {
        
        if(dangkihoc == "y" || dangkihoc == "Y"){
            if(diem >= 7.5){
                if(noiquy == "n" || noiquy == "N")
                    return true;
            }
        }

        return false;
    }

}
