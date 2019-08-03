/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.web;

/**
 *
 * @author DELL
 */
public class Student {
    private String khoa;
    private String ten;
    private String lop;

    public Student() {
    }

    public Student(String khoa, String ten, String lop) {
        this.khoa = khoa;
        this.ten = ten;
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }



    
}
