package com.example.ffi.escapejagriti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ffi.R;

public class JagritiActivity extends AppCompatActivity {

    public void jagritiAbouton(View view){
        Intent jagritiAboutIntent = new Intent(this , JagritiAboutActivity.class);
        startActivity(jagritiAboutIntent);
    }
    public void jagritiVisionon(View view){
        Intent jagritiVisionIntent = new Intent(this , JagritiVisionActivity.class);
        startActivity(jagritiVisionIntent);
    }
    public void jagritiAchivementson(View view){
        Intent jagritiAchivementsIntent = new Intent(this , JagritiAchivementsActivity.class);
        startActivity(jagritiAchivementsIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jagriti);
    }
}
