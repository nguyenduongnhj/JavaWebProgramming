/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  package com.java.demo;

import java.io.File;


/**D:\demoJavaWeb
 *
 * @author Admin
 */
public class FileUtils {

    public FileUtils() {
    }
    
    public void getFolder(String path) {
        File f = new File(path);
        
        if(f.exists()){
            for (File i : f.listFiles()) {
                if(i.isDirectory()){
                    System.out.println(i.toString());
                }
            }
        }
        else{
            System.out.println("Duong dan khong ton tai");
        }
        
        
    }
    
    public void getFile(String path) {
        File f = new File(path);
        if(f.exists()){
            for (File i : f.listFiles()) {
                if(i.isFile()){
                    System.out.println(i.toString());
                }
            }
        }
        else{
            System.out.println("Duong dan khong ton tai");
        }
        
    }
    
    public void getImage(String path) {
        
        File f = new File(path);
        
        for (File i : f.listFiles()) {
            if(i.getName().endsWith(".jpg") || i.getName().endsWith(".jpeg") || i.getName().endsWith(".png")){
                System.out.println(i.toString());    
            }
        }
        
    }
    
    public void getLastTime(String path) {
        File f = new File(path);
        for (File i : f.listFiles()) {
            if(i.isFile()){
                System.out.println( i.lastModified());
            }
        }
    }
    
    public void getSize(String size){
        File f = new File("D:\\DemoJava");
        if(size == "mb" || size == "MB"){
            double k =  f.length();
            System.out.println(k);
        }
        else if( size == "kb" || size == "KB"){
            double k =  f.length();
            System.out.println(k);
        }
    }
}
