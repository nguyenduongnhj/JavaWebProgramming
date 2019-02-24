/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_4;

import java.util.Random;

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {
        
        int i, j, cout = 0, k = 0;
        Random rd = new Random();
        int[] numbers = new int[15];
        for (i = 0; i < 15; i++) {
            numbers[i] = rd.nextInt(999);
            System.out.println(numbers[i]);
        }
        for (i = 0; i < 15; i++) {
            for (j = i+1; j < 15; j++) {
                
                if (numbers[i] < numbers[j]) {
                    k = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = k;
                }
            }
        }
        System.out.println("------------------------");
        System.out.println("sau khi xap xep giam dan");
        for(i = 0;i<15;i++){
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        for (i = 0; i < 15; i++) {
            for (j = i+1; j < 15; j++) {
                if (numbers[i] > numbers[j]) {
                    k = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = k;
                }
            }
        }
        System.out.println("");
        System.out.println("sau khi xap xep tang dan");
        for ( i = 0; i < 15; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        
    }
}
