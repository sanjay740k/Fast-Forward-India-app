package com.example.ffi.escapejagriti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class EscapeAboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape_about);

        TextView textViewAboutEscape = (TextView)findViewById(R.id.textViewAboutEscape);
        String s="The importance of English in the current generation is unparalleled. While it is indispensable in the urban " +
                "scenario, English seems to be steadily spreading its roots into the rural areas as well. For a leading developing " +
                "nation, it is important that the generations to come are well equipped with knowledge of the language, and are" +
                " capable of facing the everyday challenges of modern society. Fast Forward India aims at strengthening the " +
                "roots of our nation. ESCAPE is an extension of the same. ESCAPE, English Speaking Course And Personality " +
                "Enhancement, aims at spreading not just knowledge of the language but also communication skills and overall" +
                " personality enhancement to those with limited resources. It aim at providing a platform for building confidence," +
                " encouraging creativity and developing skills which help them in various real world situations.\n";
        textViewAboutEscape.setText(s);
    }
}
