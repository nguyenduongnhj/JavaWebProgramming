/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class StudentManager {
    
    private Connection conn = null;
    private PreparedStatement pstmt;
    private DBconector dbcn = null;

    public StudentManager() throws ClassNotFoundException, SQLException {
        dbcn = new DBconector();
        conn = dbcn.getConnection();
    }
    
    
    
    public List<Student> getStudents() throws ClassNotFoundException, SQLException {
        
        String sql = "SELECT * FROM sinh_vien";
        pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {         
            Student s = new Student();
            s.setTen(rs.getString("ten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            list.add(s);
        }
        return list;
    }
    
    public Student signIn(String email, String pass) throws SQLException{
        Student us = null;
       String strSelect = "SELECT * FROM sinhvien WHERE email = ? AND pass = ? ";
       pstmt = conn.prepareStatement(strSelect);
       pstmt.setString(1, email);
       pstmt.setString(2, pass);
       ResultSet rs = pstmt.executeQuery();
 
       if( rs.next())
       {
           us = new Student();
           us.setTen(rs.getString("ten"));
           us.setLop(rs.getString("lop"));
           us.setKhoa(rs.getString("khoa"));
       }
       return us;
    }
    
    
     
    public ResultSet loadData() throws SQLException{
        Student us = null;
       String strSelect = "SELECT * FROM sinhvien; ";
       pstmt = conn.prepareStatement(strSelect);
       ResultSet rs = pstmt.executeQuery();
       return rs;
    }
    
    
    private int nextId() {
        String strGetMaxId = "SELECT MAX(id) FROM sinhvien";
        try {
            pstmt = conn.prepareStatement(strGetMaxId);    
            ResultSet rs;
            rs = pstmt.executeQuery();
            if(rs.next())
                return rs.getInt("MAX(id)")+1;
        } catch (SQLException ex) {
           
        }
        return 100;
    }
    
    public boolean signUp(Student us) throws SQLException
    {
        int id  = nextId();
         String strInsert = "INSERT INTO sinhvien(id,NameSv,email,pass) VALUES("+id+",'"+us.getTen()
                 +"','"+us.getLop()+"','"+us.getKhoa()+"')";
         pstmt = conn.prepareStatement(strInsert);
        return pstmt.executeUpdate()>0;
    }    
    
     public boolean deleteRow(String id) throws SQLException
    {
        String strInsert = "delete from sinhvien where id = "+id+"";
        pstmt = conn.prepareStatement(strInsert);
        return pstmt.executeUpdate()>0;
    }    
   
    public ResultSet loadDataById(String id) throws SQLException{
       Student us = null;
       String strSelect = "SELECT * FROM sinhvien where id = "+id+";";
       pstmt = conn.prepareStatement(strSelect);
       ResultSet rs = pstmt.executeQuery();
       return rs;
      
    }
     
    public boolean updateSQL(Student us) throws SQLException
    {
        int id  = nextId();
         String strUpdate = "UPDATE sinhvien SET "+
                                "NameSv = '" +us.getTen()+ "', "+
                                "email = '"+us.getLop()+"', "+
                                "pass = '"+us.getKhoa()+"'";
         pstmt = conn.prepareStatement(strUpdate);
        return pstmt.executeUpdate()>0;
    }
    
    
}
