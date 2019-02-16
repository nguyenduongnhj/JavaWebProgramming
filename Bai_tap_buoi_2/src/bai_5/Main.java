/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    static String docHangChuc(int Chuc){
        switch(Chuc){
            case 1: return "muoi"; 
            case 2: return "hai"; 
            case 3: return "ba"; 
            case 4: return "bon"; 
            case 5: return "nam"; 
            case 6: return "sau"; 
            case 7: return "bay"; 
            case 8: return "tam"; 
            case 9: return "chin";
            default:
                return "";
        }
    }
    static String docHangDonVi(int chuc, int donVi){
        switch(donVi){
           case 0: return chuc == 1 ? "" : "muoi"; 
           case 1: return chuc == 1 ? "mot" : "muoi mot"; 
           case 2: return chuc == 1 ? "hai" : "muoi hai"; 
           case 3: return chuc == 1 ? "ba" : "muoi ba"; 
           case 4: return chuc == 1 ? "bon" : "muoi bon"; 
           case 5: return chuc == 1 ? "nam" : "muoi nam"; 
           case 6: return chuc == 1 ? "sau" : "muoi sau"; 
           case 7: return chuc == 1 ? "bay" : "muoi bay"; 
           case 8: return chuc == 1 ? "tam" : "muoi tam";
           case 9: return chuc == 1 ? "chin" : "muoi chin"; 
            default:
                return "";
        }
    }
    
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap vao so: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        System.out.println("so "+ n +" duoc doc la : "+ docHangChuc(n/10) +" "+ docHangDonVi(n/10, n%10) +" ");
        
    }
}
