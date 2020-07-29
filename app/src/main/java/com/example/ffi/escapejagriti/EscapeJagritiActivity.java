package com.example.ffi.escapejagriti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.ffi.R;

public class EscapeJagritiActivity extends AppCompatActivity {


    public void escapeon(View view) {
        Intent escapeIntent = new Intent(this, EscapeActivity.class);
        startActivity(escapeIntent);
    }
    public void jagrition(View view) {
        Intent jagritiIntent = new Intent(this, JagritiActivity.class);
        startActivity(jagritiIntent);
    }


    public void batch1attendenceon(View view){
        Intent batch1attendencein = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/1wFn-k9b6ojFnReHf4nyvwvvzs6mASOgl6XCuvtayVY4/edit"));
        startActivity(batch1attendencein);
    }
    public void batch2attendenceon(View view){
        Intent batch2attendencein = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/1vU49FZ8xYrAFAK1FPkeQpUEU_miTvxOFtHEQWAAt7v4/edit"));
        startActivity(batch2attendencein);
    }
    public void batch3attendenceon(View view){
        Intent batch3attendencein = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/1TAfB-DtoHQWOYbmi1PmaF9HpT7A22eGxJRfFYg1xy-0/edit"));
        startActivity(batch3attendencein);
    }
    public void volunteerattendenceon(View view){
        Intent volunteerattendencein = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/12lMdsh4FbDgcUX-vc_cjs-WHtYqPKCLySGLyLlgAlgc/edit?usp=drivesdk\n"));
        startActivity(volunteerattendencein);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape_jagriti);

    }
}
