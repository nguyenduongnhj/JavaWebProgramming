/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_6_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int a, b, r;
        System.out.print("Nhap a: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.print("Nhap b: ");
        b = input.nextInt();
        if(a==0){
            System.out.println("UCLN la b = " +b);
        }
        else{
            while(a!=0){
                r = a % b;
                b = a; 
                a = r; 
            }
            System.out.println("UCLN la b = " +b);
        }
    }
}
