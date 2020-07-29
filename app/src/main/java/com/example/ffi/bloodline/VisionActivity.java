package com.example.ffi.bloodline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class VisionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision);

        TextView textViewVisionBloodline = (TextView)findViewById(R.id.textViewVisionBloodline);
        String s="No one shall die in Dhanbad for the want of Blood. This has been our motto since the inception of Bloodline. " +
                "To achieve this, our current objective is to register at least 1,000 new donors in a year by means of donor" +
                " motivation, promotion of the concept of Voluntary Blood Donation and by repeating Regular Voluntary Blood " +
                "Donation campaigns." +
                "\n" +
                "Blood camps are organized once every three months. A number of students from ISM Dhanbad voluntarily donate" +
                " blood in these camps.";
        textViewVisionBloodline.setText(s);
    }
}
