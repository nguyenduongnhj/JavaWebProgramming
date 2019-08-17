/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

/**
 *
 * @author DELL
 */
public class News {
    private int id;
    private String title;
    private String content;
    private int author;
    private String sumary;

    public News(int id, String title, String content, int author, String sumary) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.sumary = sumary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getSummary() {
        return sumary;
    }

    public void setSummary(String sumary) {
        this.sumary = sumary;
    }
    
    
    
}
