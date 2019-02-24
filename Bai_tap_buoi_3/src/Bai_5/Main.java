/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_5;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {
        int i, tich = 0;
        int[] a = new int[3];
        int[] b = new int[3];
        int[] tong = new int[3];
        Scanner input = new Scanner(System.in);
        
        for(i = 0; i<3; i++){
            System.out.print("a["+i+"] = ");
            a[i] = input.nextInt();
        }
        for(i = 0; i<3; i++){
            System.out.print("b["+i+"] = ");
            b[i] = input.nextInt();
        }
        
        System.out.println("-------------------------");
        
        System.out.println("vecto A("+a[0]+","+a[1]+","+a[2]+")");
        System.out.println("vecto B("+b[0]+","+b[1]+","+b[2]+")");
        
        for (i = 0; i < 3; i++) {
            tong[i] = a[i] + b[i];
        }
        System.out.println("tong cua 2 vecto = C("+tong[0]+","+tong[1]+","+tong[2]+") ");
        for (i = 0; i < 3; i++) {
            tich += a[i]*b[i];
        }
        System.out.println("tich vo huong 2 vecto = "+tich+"");
    }
    
    
}
