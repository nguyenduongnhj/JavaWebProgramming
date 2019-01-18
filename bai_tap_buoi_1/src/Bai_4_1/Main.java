/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_4_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int n, max = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("moi nhap so: ");
        
        do{
            n = input.nextInt();
            if(n > max)
                max = n; 
        }while(n != 0);
        System.out.println("So lon nhat trong day vua nhap la: " + max);
    }
}
