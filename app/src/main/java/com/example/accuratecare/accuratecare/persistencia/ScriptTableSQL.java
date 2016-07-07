package com.example.accuratecare.accuratecare.persistencia;


public class ScriptTableSQL {
    public static String getUserTable() {

        StringBuilder userBuilder = new StringBuilder();
        userBuilder.append("CREATE TABLE  user_table ( ");
        userBuilder.append("_id_user   integer primary key autoincrement,   ");
        userBuilder.append("email_user  text not null unique,  ");
        userBuilder.append("password_user  text not null, ");
        userBuilder.append("id_patient_user   integer,  ");
        userBuilder.append("foreign key ( id_patient_user ) references  patient_table ( _id_patient ) );");
        return userBuilder.toString();
    }

    public static String getPatientTable() {

        StringBuilder patientBuilder = new StringBuilder();
        patientBuilder.append("CREATE TABLE  patient_table  (  ");
        patientBuilder.append("_id_patient   integer primary key autoincrement,   ");
        patientBuilder.append("name_patient  text not null,  ");
        patientBuilder.append("age_patient integer, ;");
        patientBuilder.append("weight_patient integer);");
        return patientBuilder.toString();
    }
}
