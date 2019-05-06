/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class StudentManager extends Student{

    public StudentManager() {
    }
    
    public void read(){
        try {
            FileInputStream fis = new FileInputStream("D:\\demoJavaWeb/input.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            listStudent = (List<Student>) ois.readObject();
            
            listStudent.forEach((student) -> {
                System.out.println(student);
            });
            
        } catch (FileNotFoundException ex) {
            System.err.println("Da xay ra loi : " + ex.getMessage());
            System.out.println("1");
        } catch (IOException ex) {
            System.err.println("Da xay ra loi : " + ex.getMessage());
            System.out.println("2");
        } catch (ClassNotFoundException ex) {
            System.err.println("Da xay ra loi : " + ex.getMessage());
            System.out.println("3");
        }
    }
}
