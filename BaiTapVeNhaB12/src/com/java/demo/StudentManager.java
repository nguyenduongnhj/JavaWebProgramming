package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class StudentManager {

    private List<Student> list;

    public StudentManager() {
        this.list = new ArrayList<>();
    }

    public void add() {
        Student s = new Student();
        s.add();
        this.list.add(s);
    }

    public void show() {
        try {
            FileInputStream fis = new FileInputStream("E:\\daovanchau\\labJava/demo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println(ois.readObject());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save() {
        try {
            FileOutputStream fos = new FileOutputStream("E:\\daovanchau\\labJava/demo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.list);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Student search(String name) {
        for (Student student : list) {
            if (name.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }

    public void update() {
        String name;
        int c, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten nguoi muon doi thong tin : ");
        name = input.nextLine();
        for (Student s : list) {
            if (name.equals(s.getName())) {
                System.out.println("1. Roll Number");
                System.out.println("2. Name");
                System.out.println("3. Email");
                System.out.println("4. dob");
                System.out.println("5. All");
                System.out.print("Choice : ");
                c = input.nextInt();
                switch (c) {
                    case 1:
                        String roll;
                        System.out.println("Roll Number : ");
                        roll = input.nextLine();
                        s.setRollNumber(roll);
                        break;
                    case 2:
                        System.out.println("Name : ");
                        name = input.nextLine();
                        s.setName(name);
                        break;
                    case 3:
                        String email;
                        System.out.println("Email : ");
                        email = input.nextLine();
                        s.setEmail(email);
                        break;
                    case 4:
                        Date dob = null;
                        int d;
                        System.out.println("Date : ");
                        d = Integer.parseInt(input.nextLine());
                        dob.setDate(d);
                        s.setDob(dob);
                        break;
                    case 5:
                        String roll2;
                        System.out.println("Roll Number : ");
                        roll2 = input.nextLine();
                        s.setRollNumber(roll2);
                        System.out.println("Name : ");
                        name = input.nextLine();
                        s.setName(name);
                        String email2;
                        System.out.println("Email : ");
                        email2 = input.nextLine();
                        s.setEmail(email2);
                        Date dob2 = null;
                        int d2;
                        System.out.println("Date : ");
                        d2 = Integer.parseInt(input.nextLine());
                        dob2.setDate(d2);
                        s.setDob(dob2);
                        break;
                    default:
                        System.out.println("Ki tu nhap vao khong hop le!!!");
                        System.exit(0);
                        break;
                }
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay ten nay");
        }
    }

    public void delete(String name) {
        int count = 0;
        for (Student s : list) {
            if (name.equals(s.getName())) {
                this.list.remove(s);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Ten vua nhap khong co trong danh sach");
        } else {
            System.out.println("Xoa thanh cong!!!");
        }
    }

}
