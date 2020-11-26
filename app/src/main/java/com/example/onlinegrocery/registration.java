package com.example.onlinegrocery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.media.MediaPlayer;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

public class registration extends AppCompatActivity {
    EditText mName,mEmail,mPassword;
    Button login;
    TextView already_account;
    FirebaseAuth fAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        mName = findViewById(R.id.user_name);
        mEmail = findViewById(R.id.user_email);
        mPassword = findViewById(R.id.password);
        login = findViewById((R.id.signupbtn);

        fAuth = FirebaseAuth.getInstance();

        if (fAuth.getCurrentUser() !=null){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    mEmail.setError("Email is required");
                    return;
                }
                 if(TextUtils.isEmpty(password)) {
                     mPassword.setError("password is required");
                     return;
                 }
                 fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {


                         if (task.isSuccessful()) {
                             Toast.makeText(Context:registration.this, Text:
                             "User Created.", Toast.LENGTH_SHORT).Show();
                             startActivity(new Intent(getApplicationContext().MainActivity. class));

                         } else {
                             Toast.makeText(Context:registration.this, Text:
                             "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).
                             show();
                         }
                     }

