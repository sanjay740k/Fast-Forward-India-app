package com.example.ffi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText emailLI,passwordLI;
    Button loginLI;
    TextView registerLI,forgotaLI;
    FirebaseAuth firebaseAuthLI;
    ProgressBar progressBarLI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        emailLI = (EditText)findViewById(R.id.editTextEmailLI);
        passwordLI = (EditText)findViewById(R.id.editTextPasswordLI);
        loginLI = (Button)findViewById(R.id.buttonLoginLI);
        registerLI = (TextView)findViewById(R.id.textViewCALI);
        firebaseAuthLI = FirebaseAuth.getInstance();
        progressBarLI = (ProgressBar)findViewById(R.id.progressBarLI);
        forgotaLI = (TextView) findViewById(R.id.textViewForgotALI);

        loginLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailLI.getText().toString().trim();
                String password = passwordLI.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    emailLI.setError("Email is required.");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    passwordLI.setError("Password is required.");
                    return;
                }
                if (password.length() < 6){
                    passwordLI.setError("password must be greater then equal to 6 charecter");
                    return;
                }
                progressBarLI.setVisibility(View.VISIBLE);

                firebaseAuthLI.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(LoginActivity.this,"Logged in Successfully", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            finish();
                        }
                        else{
                            Toast.makeText(LoginActivity.this,"Error !" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            progressBarLI.setVisibility(View.INVISIBLE);
                            finish();
                        }
                    }
                });
            }
        });

        registerLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
                finish();
            }
        });

        forgotaLI.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                final EditText resetpassword = new EditText(view.getContext());
                final AlertDialog.Builder passwordrestdialog = new AlertDialog.Builder(view.getContext());
                passwordrestdialog.setTitle("Reset Password ?");
                passwordrestdialog.setMessage("Enter Your Email");
                passwordrestdialog.setView(resetpassword);

                passwordrestdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String mail = resetpassword.getText().toString();
                        firebaseAuthLI.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(LoginActivity.this ,"reset Link Sent To Your Email",Toast.LENGTH_LONG).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(LoginActivity.this , "Error ! Reset Link Is Not Sent" , Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                });

                passwordrestdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                passwordrestdialog.create().show();
            }
        });
    }
}
