package com.atguigu.Test;

import org.springframework.stereotype.Component;


import java.util.*;

public class HelloSpring {
    private String name;
    private String addr;
    private String[] habits;
    private List<String> courses;
    private Map<String,Integer> grades;
    private Set<String> changes;
    private Properties pro;

    public HelloSpring() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public Set<String> getChanges() {
        return changes;
    }

    public void setChanges(Set<String> changes) {
        this.changes = changes;
    }

    public Properties getPro() {
        return pro;
    }

    public void setPro(Properties pro) {
        this.pro = pro;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", habits=" + Arrays.toString(habits) +
                ", courses=" + courses +
                ", grades=" + grades +
                ", changes=" + changes +
                ", pro=" + pro +
                '}';
    }

    public void show(){
        System.out.println(toString());
    }
}
