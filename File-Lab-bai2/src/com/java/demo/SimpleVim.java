/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class SimpleVim {
    public void createFile(String path){
        File f = new File(path);
        
        if(f.exists()){
            System.out.println("File da ton tai");
        }
        else{
            try {
                f.createNewFile();
                String e ;
                Scanner input = new Scanner(System.in);
                
                
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("SUCCESS");
        }
        
    }
    
    public void addContent(String path) {
        String name;
        Scanner input = new Scanner(System.in);
        File f = new File(path);
        System.out.print("Nhap ten file muon ghi : ");
        name = input.nextLine();
        File f1 = new File(path+"/" + name +".txt");
        if(f1.exists()){
            
            try {
                FileOutputStream fos = new FileOutputStream(f1);
                
                FileWriter fw = new FileWriter(f1);
                for (int i = 0; i < 10; i++) {
                    fw.write("TEXT");
                    
                }
                System.out.println("Ghi thanh cong");
                fw.close();
                
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
  
        }
        else{
            System.out.println("File chua ton tai!!");
            
        }
        
        
    }
}
