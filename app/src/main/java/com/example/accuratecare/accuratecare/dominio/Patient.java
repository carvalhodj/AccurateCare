package com.example.accuratecare.accuratecare.dominio;

public class Patient {

    private int id;
    private String name;
    private int age;
    private long weight;

    private User user;

    /*public Patient(String name, int age, String email, long weight, User user) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.user = user;
    }*/

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }
}
