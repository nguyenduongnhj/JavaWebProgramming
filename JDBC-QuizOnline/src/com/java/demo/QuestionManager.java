/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class QuestionManager {

    private Connection conn = null;
    public QuestionManager() throws  Exception {
        this.conn = new connect().getConnect();
    }
   
    public List<Questions> getQuestions() throws ClassNotFoundException, SQLException {
        // 1 . ket noi db
        // 2 . tao cau truy van query
        String query =  "SELECT * FROM questions";
        // 3 . thuc thi cau truy van query
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        // 4 . duyet ket qua va add vao list
        List<Questions> list = new ArrayList<>();
        while (rs.next()) {
            Questions q = new Questions();
            q.setId(rs.getInt("id"));
            q.setContent(rs.getString("content"));
            q.setAnswerA(rs.getString("answer_a"));
            q.setAnswerB(rs.getString("answer_b"));
            q.setAnswerC(rs.getString("answer_c"));
            q.setAnswerD(rs.getString("answer_d"));
            q.setCorrect(rs.getString("correct"));
            list.add(q);
        }
        
        return list;
    }
}