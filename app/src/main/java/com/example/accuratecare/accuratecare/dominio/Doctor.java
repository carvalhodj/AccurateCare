package com.example.accuratecare.accuratecare.dominio;

import java.util.List;

public class Doctor {

    private int id;
    private String indentification;

    private User user;
    private List<Patient> patients;

    public Doctor(String indentification, User user, List<Patient> patients) {
        this.indentification = indentification;
        this.user = user;
        this.patients = patients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public String getIndentification() {
        return indentification;
    }

    public void setIndentification(String indentification) {
        this.indentification = indentification;
    }
}
