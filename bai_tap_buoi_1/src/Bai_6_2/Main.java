/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_6_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int a, b, r, c, x, y;
        System.out.print("Nhap a: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.print("Nhap b: ");
        b = input.nextInt();
        x = a;
        y = b;
        if(a==0){
            c = b;
        }
        else{
            while(a!=0){
                r = a % b;
                b = a; 
                a = r; 
            }
            c = b;
        }
        System.out.println("BCNN la : " +((x*y)/c));
    }
}
