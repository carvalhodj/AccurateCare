package com.example.accuratecare.accuratecare.negocio;


import android.content.Context;

import com.example.accuratecare.accuratecare.R;
import com.example.accuratecare.accuratecare.infra.AccurateCareException;
import com.example.accuratecare.accuratecare.infra.UserSession;
import com.example.accuratecare.accuratecare.dominio.Patient;
import com.example.accuratecare.accuratecare.dominio.User;
import com.example.accuratecare.accuratecare.gui.LoginActivity;
import com.example.accuratecare.accuratecare.persistencia.UserDao;

public class UserBusiness {
    private static UserDao userDao;
    private static UserBusiness instanceUserBusiness = new UserBusiness();

    private UserBusiness(){}
    private Patient patientFound;

    public static UserBusiness getInstancia(Context context) {
        userDao = UserDao.getInstance(context);
        return instanceUserBusiness;
    }

    public Patient searchById(int id) {
        Patient pessoa = null;
        pessoa = userDao.searchPatientId(id);
        return pessoa;
    }

    public User signIn(String email, String password) throws AccurateCareException {
        User user = userDao.searchUser(email, password);
        String invalidLogin = "";

        if (user == null) {
            invalidLogin = LoginActivity.getContext().getString(R.string.login_error);
        }
        if (invalidLogin.length() > 0) {
            throw new AccurateCareException(invalidLogin);
        }

        UserSession sessaoUsuario = UserSession.getInstance();
        sessaoUsuario.setLoggedUser(user);
        sessaoUsuario.setLoggedPatient(searchById(user.getId()));

        return user;
    }

    public void validateRegister(Patient patient) throws AccurateCareException {
        User user = userDao.searchUserEmail(patient.getUser().getEmail());
        if (user != null) {
            throw new AccurateCareException("Email already registered");
        }
        userDao.registerPatient(patient);
    }

}
