/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_5_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int n;
        double sum = 0, i;
        System.out.print("Nhap n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(i = 0; i < n; i++ ){
            sum += (2*i+1)/(2*i+2);
        }
        System.out.println("Tong cua day so la: " +sum );
    }
}
