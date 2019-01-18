/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_4_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        
        int n, min;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("moi nhap so: ");
        n = input.nextInt();
        min = n;
        while(n != 0){
            n = input.nextInt();
            
            if(n != 0){
                if(n < min)
                    min = n;
            }
        }
        System.out.println("So nho nhat trong day vua nhap la: " + min);
    }
}
