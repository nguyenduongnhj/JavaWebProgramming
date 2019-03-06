/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bai_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoPhuc {
    private int phanthuc;
    private int phanao;

    public SoPhuc() {
    }

    public SoPhuc(int phanthuc, int phanao) {
        this.phanthuc = phanthuc;
        this.phanao = phanao;
    }

    public int getPhanao() {
        return phanao;
    }

    public int getPhanthuc() {
        return phanthuc;
    }

    public void setPhanao(int phanao) {
        this.phanao = phanao;
    }

    public void setPhanthuc(int phanthuc) {
        this.phanthuc = phanthuc;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap phan thuc cua so phuc: ");
        this.phanthuc = input.nextInt();
        
        System.out.print("Nhap phan ao cua so phuc: ");
        this.phanao = input.nextInt();
    }
    
    
}
