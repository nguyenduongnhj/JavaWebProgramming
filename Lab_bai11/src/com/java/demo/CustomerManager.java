/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Admin
 */
public class CustomerManager {

    private List<Customer> list;

    public CustomerManager() {
        this.list = new ArrayList<>();
    }

    public boolean load(String file) {

        try {
            FileInputStream fis = new FileInputStream(file);

            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println(ois.readObject());
            ois.close();

            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public void add() {
        Customer c = new Customer();
        c.input();
        this.list.add(c);
    }

    public Customer search(int id) {

        for (Customer c : this.list) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public boolean save() {

        try {
            FileOutputStream fos = new FileOutputStream("D:\\demoJavaWeb/demo.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this.list);
            oos.flush();
            oos.close();
            return true;

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            return false;
        } catch (IOException ex) {
            return false;
        }

    }

}
