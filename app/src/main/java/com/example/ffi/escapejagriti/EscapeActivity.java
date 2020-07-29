package com.example.ffi.escapejagriti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ffi.R;

public class EscapeActivity extends AppCompatActivity {

    public void escapeAbouton(View view){
        Intent escapeAboutIntent = new Intent(this , EscapeAboutActivity.class);
        startActivity(escapeAboutIntent);
    }
    public void escapeVisionon(View view){
        Intent escapeVisionIntent = new Intent(this , EscapeVisionActivity.class);
        startActivity(escapeVisionIntent);
    }
    public void escapeAchivementson(View view) {
        Intent escapeAchivementsIntent = new Intent(this, EscapeAchivementsActivity.class);
        startActivity(escapeAchivementsIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape);
    }
}
