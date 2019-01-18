/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        double n;
        int i, dem = 0;
        
        System.out.print("n = ");
        Scanner input = new Scanner(System.in);
        n = input.nextDouble();
        
        for( i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0){
                dem++;
            }
        }
        
        if(dem==0){
            System.out.println("So " + n + " la so nguyen to");
        }
        else{
            System.out.println("So " + n + " khong phai so nguyen to");
        }
    }
}
