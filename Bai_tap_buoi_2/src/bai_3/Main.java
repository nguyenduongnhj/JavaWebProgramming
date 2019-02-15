/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int h, i, j, k;
        
        System.out.print("h= ");
        Scanner input = new Scanner(System.in);
        h = input.nextInt();
        for(i = 0; i <= h; i++){
            for(j = 0; j<(h-i); j++){
                System.out.print(" ");
            }
            for(k = 0; k < (2*i-1);k++){
                System.out.print("*"); 
            }
            System.out.println("");
        }
        
    }
}
