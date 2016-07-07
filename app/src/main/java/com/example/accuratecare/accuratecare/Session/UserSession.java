package com.example.accuratecare.accuratecare.Session;


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

    public void setPessoaLogada(Patient pessoa) {
        this.loggedPatient = pessoa;
    }

    public void setUsuarioLogado(User usuario) {
        this.loggedUser = usuario;
    }

    public void invalidateSession(){
        this.setUsuarioLogado(null);
        this.setPessoaLogada(null);
    }
}
