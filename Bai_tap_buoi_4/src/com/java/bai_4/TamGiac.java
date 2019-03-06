/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bai_4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TamGiac {

    private int canh1;
    private int canh2;
    private int canh3;

    public TamGiac() {

    }

    public TamGiac(int canh1, int canh2, int canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public int getcanh1() {
        return canh1;
    }

    public int getcanh2() {
        return canh2;
    }

    public int getcanh3() {
        return canh3;
    }

    public void setcanh1() {
        this.canh1 = canh1;
    }

    public void setcanh2() {
        this.canh2 = canh2;
    }

    public void setcanh3() {
        this.canh3 = canh3;
    }

    public void nhap3canh() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap canh 1: ");
        this.canh1 = input.nextInt();

        System.out.print("Nhap canh 2: ");
        this.canh2 = input.nextInt();

        System.out.print("Nhap canh 3: ");
        this.canh3 = input.nextInt();

        while (canh1 + canh2 <= canh3 || canh1 + canh3 <= canh2 || canh2 + canh3 <= canh1) {
            System.out.println("Tam giac vua nhap khong hop le!!!");
            System.out.println("Nhap lai tam giac");
            System.out.println("===========");

            System.out.print("Nhap canh 1: ");
            this.canh1 = input.nextInt();

            System.out.print("Nhap canh 2: ");
            this.canh2 = input.nextInt();

            System.out.print("Nhap canh 3: ");
            this.canh3 = input.nextInt();

        }
    }
    
    public void checktg(){
        if(canh1 + canh2 <= canh3 || canh1 + canh3 <= canh2 || canh2 + canh3 <= canh1){
            
        }
        else if(canh1 == canh2 && canh2 == canh3){
            System.out.println("Day la tam giac deu !!!");
        }
        else if((canh1 == canh2 || canh1 == canh3 || canh2 == canh3)&&(canh1*canh1 + canh2*canh2 == canh3*canh3 ||canh1*canh1 + canh3*canh3 == canh2*canh2 ||canh3*canh3 + canh2*canh2 == canh1*canh1 )){                
            System.out.println("Day la tam giac vuong can !!!");
        }
        else if(canh1 == canh2 || canh1 == canh3 || canh2 == canh3){
            System.out.println("Day la tam giac can  !!!");
        }
        else if(canh1*canh1 + canh2*canh2 == canh3*canh3 ||canh1*canh1 + canh3*canh3 == canh2*canh2 ||canh3*canh3 + canh2*canh2 == canh1*canh1){
            System.out.println("Day la tam giac vuong !!!");
        }
        else{
            System.out.println("Day la tam giac thuong !!!");
        }
        
        
    }
    
    public int tinhchuvi(){
        return canh1+canh2+canh3;
    }
    
    public double tinhdientich(){
        int p;
        p = tinhchuvi()/2;
        return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
    }
    
    

}
