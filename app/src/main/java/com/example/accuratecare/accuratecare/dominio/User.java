package com.example.accuratecare.accuratecare.dominio;

public class User {

    private int id;
    private String email;
    private String password;

    public User(String login, String password) {
        this.email = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return email;
    }

    public void setLogin(String login) {
        this.email = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
