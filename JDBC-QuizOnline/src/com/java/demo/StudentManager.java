/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class StudentManager {
    Connection conn;

    public StudentManager() throws SQLException, ClassNotFoundException {
        connect db = new connect();
        this.conn = db.getConnect();
    }
    
    public Student login(String email, String pass) throws SQLException{
        String query = "SELECT * FROM student where email = ? AND pass = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);
        
        ResultSet rs = pstmt.executeQuery();
        Student s = null;
        while(rs.next()){
            s = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("pass"));            
        }
        return s;
    }
    
    public int addAnswer(Student s, Questions q, String answer) throws SQLException{
        String query = "INSERT INTO student_question VALUES(?,?,?)";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.setInt(2, q.getId());
        pstmt.setString(3, answer);
        return pstmt.executeUpdate();
    }
    
    public void printResult(){
        
    }
    
    
}
