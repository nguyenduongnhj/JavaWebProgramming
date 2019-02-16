/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_6;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int i, j, k;
        int tongsotien = 3000000;
        for(i = 0; i <= (tongsotien/100000); i++){
            for(j = 0; j < ((tongsotien-i*100000)/200000); j++){
                for(k = 0; k <= ((tongsotien - i*100000 -j*200000)/500000); k++){
                    
                    if((i*100000 + j*200000 + k*500000) == tongsotien){
                        System.out.println("3000000 doi duoc thanh: "+ i +" to 100000 "+ j +" to 200000 "+ k +" to 500000");
                    }
                    
                }
            }
        }
            
        
    }
}
