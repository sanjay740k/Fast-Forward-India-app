package com.example.ffi.bloodline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ffi.R;
import com.example.ffi.bloodline.AboutActivity;
import com.example.ffi.bloodline.AchivementsActivity;
import com.example.ffi.bloodline.AddCaseActivity;
import com.example.ffi.bloodline.VisionActivity;


public class BloodlineActivity extends AppCompatActivity {

    public void addcaseon(View view){
        Intent addCaseIntent = new Intent(this , AddCaseActivity.class);
        startActivity(addCaseIntent);
    }
    public void abouton(View view){
        Intent aboutIntent = new Intent(this , AboutActivity.class);
        startActivity(aboutIntent);
    }
    public void visionon(View view){
        Intent visionIntent = new Intent(this , VisionActivity.class);
        startActivity(visionIntent);
    }
    public void achivementson(View view){
        Intent achivementsIntent = new Intent(this , AchivementsActivity.class);
        startActivity(achivementsIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodline);
    }
}
