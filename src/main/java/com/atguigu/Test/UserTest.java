package com.atguigu.Test;


public class UserTest {
    private String username;
    private String password;
    private String addr;

    public UserTest(String addr) {
        this.addr = addr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void show(){
        System.out.println(toString());
    }
}
