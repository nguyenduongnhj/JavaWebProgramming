/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        int i, tong = 0, tong_le = 0, tong_chan = 0;
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        for(i = 0; i<5; i++){
            System.out.print("numbers["+i+"] = ");
            numbers[i] = input.nextInt();
            tong += numbers[i];
            if(numbers[i]%2 == 0){
                tong_chan += numbers[i];
            }
            else{
                tong_le += numbers[i];
            }
        }
        for (i = 0; i<5; i++) {
                System.out.println("numbers["+i+"]= "+numbers[i]+"");
            }
        System.out.println("-------------");
        System.out.println("tong cac phan tu le : "+tong_le+"");
        System.out.println("tong cac phan tu chan la: "+tong_chan+"");
        System.out.println("tong cac phan tu la: "+tong+"");
    }
    
}
