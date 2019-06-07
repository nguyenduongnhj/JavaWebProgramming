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
import java.util.List;

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
    
    public void printResult(Student s) throws SQLException, ClassNotFoundException, Exception {

        String query = "select sq.correct as student_answer, q.* from student_question as sq "
                + "join question as q on q.id = sq.question_id "
                + "where sq.student_id = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        ResultSet rs = pstmt.executeQuery();
        int questionCount = 1;
        
        QuestionManager qm = new QuestionManager();
        List<Questions> questions = qm.getQuestions();
//        
//        int total = 0;
//        while (rs.next()) {
//            total++;
//        }
//        rs.beforeFirst();

        while (rs.next()) {
            // so sanh ket qua
            String result = rs.getString("correct").toLowerCase()
                    .equals(rs.getString("student_answer").toLowerCase()) 
                    ? "True" : "False";
            System.out.printf("Question %d/%d - %s\n", questionCount++, questions.size() ,result);
            System.out.println(rs.getString("content"));
            
            if (rs.getString("correct").equals("a"))
                System.out.println("[A]. " + rs.getString("answer_a"));
            else 
                System.out.println("A. " + rs.getString("answer_a"));
            
            if (rs.getString("correct").equals("b"))
                System.out.println("[B]. " + rs.getString("answer_b"));
            else 
                System.out.println("B. " + rs.getString("answer_b"));
            
            if (rs.getString("correct").equals("c"))
                System.out.println("[C]. " + rs.getString("answer_c"));
            else 
                System.out.println("C. " + rs.getString("answer_c"));
            
            if (rs.getString("correct").equals("d"))
                System.out.println("[D]. " + rs.getString("answer_d"));
            else 
                System.out.println("D. " + rs.getString("answer_d"));
            
            
        }
    }
    
    
}
