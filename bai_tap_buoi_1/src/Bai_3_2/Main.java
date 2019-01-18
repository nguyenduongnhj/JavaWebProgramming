/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        double n;
        int i, dem = 0, z = 0, k = 2;
        
        System.out.print("nhap vao so luong so nguyen to muon in ra : ");
        Scanner input = new Scanner(System.in);
        n = input.nextDouble();
        System.out.println( n + " so nguyen to dau tien la: ");
        
        while(z < n){
            dem = 0;
            for(i = 2; i <= Math.sqrt(k); i++ ){
                if(k%i == 0){
                    dem++;
                }
            }
            if(dem == 0){
                System.out.print(k + " ");
                z++;
            }
            k++;
        }
    }
            
}
