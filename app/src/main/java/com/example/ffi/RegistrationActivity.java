package com.example.ffi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {

    EditText nameCNA,emailCNA,passwordCNA,phoneCNA;
    Button registerCNA;
    TextView loginCNA;
    FirebaseAuth firebaseAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        nameCNA = (EditText)findViewById(R.id.editTextNameCNA);
        emailCNA = (EditText)findViewById(R.id.editTextEmailCNA);
        passwordCNA = (EditText)findViewById(R.id.editTextPasswordCNA);
        phoneCNA = (EditText)findViewById(R.id.editTextPhoneCNA);
        registerCNA = (Button)findViewById(R.id.buttonRegisterCNA);
        loginCNA = (TextView)findViewById(R.id.textViewARCNA);
        firebaseAuth = FirebaseAuth.getInstance();
        progressBar = (ProgressBar)findViewById(R.id.progressBarCNA);


        if(firebaseAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }

        registerCNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String email = emailCNA.getText().toString().trim();
                 String password = passwordCNA.getText().toString().trim();

                 if(TextUtils.isEmpty(email)){
                     emailCNA.setError("Email is required.");
                     return;
                 }
                 if (TextUtils.isEmpty(password)){
                     passwordCNA.setError("Password is required.");
                     return;
                 }
                 if (password.length() < 6){
                     passwordCNA.setError("password must be greater then equal to 6 charecter");
                     return;
                 }
                 progressBar.setVisibility(View.VISIBLE);

                 firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if(task.isSuccessful()){
                             Toast.makeText(RegistrationActivity.this,"Registration Successful", Toast.LENGTH_LONG).show();
                             startActivity(new Intent(getApplicationContext(),MainActivity.class));
                             finish();
                         }
                         else{
                             Toast.makeText(RegistrationActivity.this,"Error !" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                             progressBar.setVisibility(View.INVISIBLE);
                             finish();
                         }
                     }
                 });
            }
        });

        loginCNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });
    }
}
