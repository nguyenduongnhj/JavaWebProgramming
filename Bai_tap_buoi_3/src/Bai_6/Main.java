/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_6;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {
        
        int i, j, tong = 0;
        int[][] matrix = new int[3][3];
        Scanner input = new Scanner(System.in);
        
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print("matrix["+i+"]["+j+"] = ");
                matrix[i][j] = input.nextInt();
            }
        }
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.printf("%3d ",matrix[i][j]);
            }
            System.out.println("");
        }
        for ( j = 0; j < 3; j++) {
            tong += matrix[0][j];
        }
        System.out.println("--------------------");
        System.out.println("tong hang 1 = "+tong+"");
        tong = 0;
        for ( j = 0; j < 3; j++) {
            tong += matrix[1][j];
        }
        System.out.println("tong hang 2 = "+tong+"");
        tong = 0;
        for ( j = 0; j < 3; j++) {
            tong += matrix[2][j];
        }
        System.out.println("tong hang 3 = "+tong+"");
        tong = 0;
        
        
        
        for ( i = 0; i < 3; i++) {
            tong += matrix[i][0];
        }
        System.out.println("tong cot 1 = "+tong+"");
        tong = 0;
        for ( i = 0; i < 3; i++) {
            tong += matrix[i][1];
        }
        System.out.println("tong cot 2 = "+tong+"");
        tong = 0;
        for ( i = 0; i < 3; i++) {
            tong += matrix[i][2];
        }
        System.out.println("tong cot 3 = "+tong+"");
    }
}
