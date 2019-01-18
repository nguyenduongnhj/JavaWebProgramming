/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int n = 1  ;
        int sum = 1;
        
        System.out.print("n = ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        for(int i = 1; i <= n ;i++){
            sum *= i;
        }
                
        System.out.println("Gia tri cua n! la : " + sum);
    }
    
}
