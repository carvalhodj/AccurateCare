package com.example.accuratecare.accuratecare.persistencia;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String NAME_DB = "bank";
    private static final int VERSION_DB = 1;

    public DatabaseHelper(Context context) {
        super(context.getApplicationContext(),NAME_DB,null,VERSION_DB);
    }

    //PATIENT TABLE
    public static final String PATIENT_TABLE= "patient_table";
    public static final String PATIENT_ID = "_id_patient";
    public static final String PATIENT_NAME = "name_patient";
    public static final String PATIENT_AGE = "age_patient";
    public static final String PATIENT_WEIGHT = "weight_patient";

    //USER TABLE
    public static final String USER_TABLE = "user_table";
    public static final String USER_ID = "_id_user";
    public static final String USER_EMAIL = "email_user";
    public static final String USER_PASSWORD = "password_user";
    public static final String USER_PETIENT_ID = "id_patient_user";



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptTableSQL.getPatientTable());
        db.execSQL(ScriptTableSQL.getUserTable());


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + USER_TABLE);
        db.execSQL("drop table if exists " + PATIENT_TABLE);
        onCreate(db);
    }
}
