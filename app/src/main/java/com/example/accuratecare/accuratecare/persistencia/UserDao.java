package com.example.accuratecare.accuratecare.persistencia;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.accuratecare.accuratecare.dominio.Patient;
import com.example.accuratecare.accuratecare.dominio.User;

public class UserDao {
    private static DatabaseHelper databaseHelper;
    private static Context context;

    private static UserDao userDaoInstance = new UserDao();
    private UserDao(){};

    public static UserDao getInstance(Context context){
        UserDao.context = context;
        UserDao.databaseHelper = new DatabaseHelper(context);
        return userDaoInstance;
    }

    public void registerPatient(Patient patient){
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(DatabaseHelper.PATIENT_NAME, patient.getName());
        values.put(DatabaseHelper.PATIENT_AGE, patient.getAge());
        values.put(DatabaseHelper.PATIENT_WEIGHT, patient.getWeight());

        long foreing_key_id_pessoa = db.insert(DatabaseHelper.PATIENT_TABLE, null, values);

        values = new ContentValues();
        values.put(DatabaseHelper.USER_EMAIL, patient.getUser().getEmail());
        values.put(DatabaseHelper.USER_PETIENT_ID, foreing_key_id_pessoa);
        values.put(DatabaseHelper.USER_PASSWORD, patient.getUser().getPassword());

        db.insert(DatabaseHelper.USER_TABLE, null, values);
        db.close();
    }

    private Patient createPatient(Cursor cursor){
        Patient patient = new Patient();
        patient.setId(cursor.getInt(0));
        patient.setName(cursor.getString(1));
        patient.setAge(cursor.getInt(2));
        patient.setWeight(cursor.getLong(3));
        return patient;
    }

    private User createUser(Cursor cursor){
        User user = new User();
        user.setId(cursor.getInt(0));
        user.setEmail(cursor.getString(1));
        user.setPassword(cursor.getString(2));
        return user;
    }









}
