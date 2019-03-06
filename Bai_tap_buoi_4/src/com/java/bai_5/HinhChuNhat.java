/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bai_5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {

    private int chieudai;
    private int chieurong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public int getChieudai() {
        return chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }

    public void Input() {
        int temp = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap chieu dai: ");
        chieudai = input.nextInt();

        System.out.println("Nhap chieu rong: ");
        chieurong = input.nextInt();

        if (chieudai < chieurong) {
            temp = chieudai;
            chieudai = chieurong;
            chieurong = temp;
        }
    }

    public int tinhdientich() {
        return chieudai * chieurong;
    }

    public int tinhchuvi() {
        return 2 * (chieudai + chieurong);
    }

}
