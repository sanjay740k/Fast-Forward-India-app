package com.example.ffi.umeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ffi.R;


public class UmeedActivity extends AppCompatActivity {

    public void umeedAbouton (View view){
        Intent umeedAboutin = new Intent(this , UmeedAboutActivity.class);
        startActivity(umeedAboutin);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umeed);
    }
}
