/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_5_9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int n, x, i, sum = 0,temp = 1;
        System.out.print("Nhap n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.print("Nhap x: ");
        x = input.nextInt();
        for(i = 1; i <= n; i++ ){
            temp *=x;
            sum += temp;
        }
        System.out.println("Tong cua day so la: " +sum);
    }
}