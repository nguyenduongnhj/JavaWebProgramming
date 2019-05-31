/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("   QUIZ ONLINE   ");
            System.out.println("------------------");
            System.out.print("Enter Email: ");
            String email = input.nextLine();
            
            System.out.print("Enter Pass: ");
            String pass = input.nextLine();
            
            StudentManager sm = new StudentManager();
            Student s = sm.login(email, pass);
            
            if (s != null) {
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
                input.nextLine();
                System.out.println("---------------");
                QuestionManager qm = new QuestionManager();
                List<Questions> questions = qm.getQuestions();
                int countCorr = 0;
                int index = 1;
                for (Questions q : questions) {
                    System.out.printf("Question %d/%d \n", index++, questions.size());
                    System.out.println(q);
                    System.out.print("Your answer > ");
                    String answer = input.nextLine();
                    sm.addAnswer(s, q, answer);
                    if (answer.toLowerCase().equals(q.getCorrect().toLowerCase())) {
                        countCorr++;
                    }
                }
                System.out.println("Congratulation!");
                System.out.printf("Your result: %d/%d \n", countCorr, questions.size());
                System.out.println("See Detail (Y/N)");
                sm.printResult();
            } else {
                System.out.println("LOGIN FAIL!");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
    }
    
}