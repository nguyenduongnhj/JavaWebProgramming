/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;


import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String path,ch;
        int c;
        Scanner input = new Scanner(System.in);
        FileUtils f = new FileUtils();
        System.out.print("Nhap duong dan: ");
        path = input.nextLine();
        System.out.println("1. Lay folder");
        System.out.println("2. Lay file");
        System.out.println("3. Lay file anh");
        System.out.println("4. Lay thoi gian cap nhat cuoi cung");
        System.out.println("5. Lay size file");
        System.out.print("Choice : ");
        c = input.nextInt();
        
        switch(c){
            case 1:
                f.getFolder(path);
                break;
            case 2:
                f.getFile(path);
                break;
            case 3:
                f.getImage(path);
                break;
            case 4:
                f.getLastTime(path);
                break;
            case 5:
                System.out.println("mb/kb ?");
                System.out.print("choice : ");
                ch = input.nextLine();
                f.getSize(ch);
                break;
                default:
                    System.out.println("loi nhap vao khong hop le");
                break;
                            
        }    
    }
    
}
