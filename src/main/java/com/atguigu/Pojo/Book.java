package com.atguigu.Pojo;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Book {
    private String bookName;
    private double price;
    private User author;
    private String[] target;
    private ArrayList<String> des;
    private HashSet<String> names;
    private HashMap<String,String> users;

    public Book() {
        System.out.println("无参Book构造器");
    }

    public Book(String bookName, double price, User author, String[] target, ArrayList<String> des, HashSet<String> names, HashMap<String, String> users) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
        this.target = target;
        this.des = des;
        this.names = names;
        this.users = users;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String[] getTarget() {
        return target;
    }

    public void setTarget(String[] target) {
        this.target = target;
    }

    public ArrayList<String> getDes() {
        return des;
    }

    public void setDes(ArrayList<String> des) {
        this.des = des;
    }

    public HashSet<String> getNames() {
        return names;
    }

    public void setNames(HashSet<String> names) {
        this.names = names;
    }

    public HashMap<String, String> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, String> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", author=" + author +
                ", target=" + Arrays.toString(target) +
                ", des=" + des +
                ", names=" + names +
                ", users=" + users +
                '}';
    }
}
