package com.example.ffi.disha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ffi.R;

public class DishaActivity extends AppCompatActivity {

    public void DishaAbouton(View view){
        Intent DishaAboutIntent = new Intent(this , DishaAboutActivity.class);
        startActivity(DishaAboutIntent);
    }
    public void DishaVisionon(View view){
        Intent DishaVisionIntent = new Intent(this , DishaVisionActivity.class);
        startActivity(DishaVisionIntent);
    }
    public void DishaAchivementson(View view){
        Intent DishaAchivementsIntent = new Intent(this , DishaAchivementsActivity.class);
        startActivity(DishaAchivementsIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disha);
    }
}
