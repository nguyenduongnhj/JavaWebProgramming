/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {
        int i, max = 0, min = 999;
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        
        for(i = 0; i < 5; i++){
            System.out.print("numbers["+i+"] = ");
            numbers[i] = input.nextInt();
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
            if (numbers[i]%3 == 0) {
                System.out.println(""+numbers[i]+" la so chia het cho 3 : ");
            }
        }
        System.out.println("-----------------------");
        System.out.println("so lon nhat la: "+max+"");
        System.out.println("so nho nhat la: "+min+"");
        
    }
}
