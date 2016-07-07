package com.example.accuratecare.accuratecare.infra;


import com.example.accuratecare.accuratecare.dominio.Patient;
import com.example.accuratecare.accuratecare.dominio.User;

public class UserSession {
    private static UserSession userSessionInstance = new UserSession();
    private UserSession(){}
    public static UserSession getInstance() { return userSessionInstance; }

    private User loggedUser = null;
    private Patient loggedPatient = null;

    public Patient getLoggedPatient() {
        return loggedPatient;
    }

    public void setLoggedPatient(Patient patient) {
        this.loggedPatient = patient;
    }

    public void setLoggedUser(User user) {
        this.loggedUser = user;
    }

    public void invalidateSession(){
        this.setLoggedUser(null);
        this.setLoggedPatient(null);
    }
}
