/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bai_6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public void inputFraction(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        this.numerator = input.nextInt();
        System.out.print("Nhap mau so: ");
        this.denominator = input.nextInt();
    }
    public void showFraction(){
        System.out.println("Phan so da nhap la: "+numerator+"/"+denominator);
    }
    
    public int gcd(int a, int b){
        int r;
        while(b != 0){
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public void compact(){
        int a = 0;
        a = gcd(numerator,denominator);
        this.numerator = numerator/a;
        this.denominator = denominator/a;
        
        if(a == 0){
            System.out.println("Phan so da toi gian");
        }
        else{
            System.out.println("Phan so sau khi rut gon la: " + numerator+ "/"+ denominator);
        }
        
    }
    
    public void inverse(){
        int temp;
        
        temp = numerator;
        numerator = denominator;
        denominator = temp;
        
        
        System.out.println("Phan so sau khi nghich dao la: " + numerator+ "/"+ denominator);
    }
    
    
    
    
    
    
    
    
    
    
    
}
