/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_5_8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
       int n, i, sum = 0,temp = 1;
        System.out.print("Nhap n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(i = 1; i <= n; i++ ){
            temp *=i;
            sum += temp;
        }
        System.out.println("Tong cua day so la: " +sum);
    }
}
