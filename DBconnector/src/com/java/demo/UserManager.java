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
 * @author DELL
 */
public class UserManager {

    private Connection conn = null;

    public UserManager() throws Exception {
        this.conn = new DBconector().getConnection();
    }

    public boolean login(String user, String pass) throws SQLException {

        String query = "SELECT * FROM user_account WHERE user_name = ? AND user_pass = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, user);
        pstmt.setString(2, pass);

        ResultSet rs = pstmt.executeQuery();
        return rs.next();

    }
    
    public boolean createAccount(String user, String pass, String name, boolean gender, int year, int month, int day, String email) throws SQLException{
        int genDer;
        if (gender) {
            genDer = 1;
        } else {
            genDer = 0;
        }
        
        String query = "SELECT * FROM user_account WHERE user_name = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, user);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            return false;
                    
        } else {
            query = "INSERT INTO user_account (`user_name`, `user_pass`) VALUES (?, ?)";
            PreparedStatement prepareStatement = this.conn.prepareStatement(query);
            prepareStatement.setString(1, user);
            prepareStatement.setString(2, pass);
            prepareStatement.execute();
            
            query = "INSERT INTO `user`.`user_profile` (`user_name`, `name`, `gender`, `birthday`, `email`) VALUES (?, ?, ?, ?, ?)";
            prepareStatement.setString(1, user);
            prepareStatement.setString(2, name);
            prepareStatement.setString(3, genDer+"");
            prepareStatement.setString(4, year+"/"+month+"/"+day);
            prepareStatement.setString(5, email);
            prepareStatement.execute();

            return true;
        }
    }

}
