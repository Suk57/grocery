package com.example.onlinegrocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.onlinegrocery2.NewActivity;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class login extends AppCompatActivity {
    EditText loginText,passwordText;
    Button btnLogin;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginText = (EditText) findViewById(R.id.Login);
        passwordText= (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.ButtonLogin);
        firebaseAuth=FirebaseAuth.getInstance();
        btnLogin.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
            }
                String username = loginText.getText().toString();
                 String password = passwordText.getText().toString();
                if (username.equals("user")&& (password.equals("123456"))) {
                    {
                        Toast.makeText( context: MainActivity.this, text:  "Welcome",Toast.LENGTH_SHORT.Show();
                        Intent intent new Intent(getApplicationContext(),NewActivity.class);
                        startActivity(intent);
                    }else
                    {
                        Toast.makeText(context:MainActivity.this, text: "Invalid Credentilias", Toast.LENGTH_SHORT.show();




                    }}



    }
}