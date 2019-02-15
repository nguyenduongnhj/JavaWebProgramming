/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int m, n, i, j;
        System.out.print("m = ");
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        System.out.print("n = ");
        n = input.nextInt();
        for(i = 0; i < m; i++){
            System.out.print("*");
            for(j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
