/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {
        int i, a;
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        for(i = 0; i<5; i++){
            System.out.print("numbers["+i+"] = ");
            numbers[i] = input.nextInt();
        }
        System.out.print("nhap a: ");
        a = input.nextInt();
        System.out.println("----------------------");
        for(i = 0; i < 5; i++){
            if(numbers[i] == a){
                System.out.println("so "+a+" co trong mang");
                System.out.println("so "+a+" o vi tri "+i);
            }
            else{
                System.out.println("so "+a+" khong co trong mang");
            }
        }
    }
}
