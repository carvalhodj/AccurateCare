package com.example.accuratecare.accuratecare.gui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.accuratecare.accuratecare.R;

public class LoginActivity extends Activity{

    private EditText edtEmail;
    private EditText edtPassword;
    private static Context context;
    private Button btnSignIn;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = this;
        edtEmail = (EditText) findViewById(R.id.login_userEmail);
        edtPassword = (EditText) findViewById(R.id.login_userPassword);

        btnSignIn = (Button) findViewById(R.id.btn_login_signIn);
        btnSignUp = (Button) findViewById(R.id.btn_login_signUp);

    }

    public static Context getContext(){ return context; }


    public void startSignUpActivity(View view) {
        Intent it = new Intent(LoginActivity.this,SignUpActivity.class);
        startActivity(it);
    }

    public void login(View v){

    }




}
