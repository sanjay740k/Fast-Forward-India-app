package com.example.ffi.escapejagriti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class JagritiAboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jagriti_about);

        TextView textViewAboutJagriti = (TextView)findViewById(R.id.textViewAboutJagriti);
        String s="In today’s competitive world, it is not the fittest who survives, but it is the one who is most adaptive to " +
                "change. Life today has become so fast that we are dependent on machines for most of our work. Computers have" +
                " penetrated our lives so deep that to achieve professional success in any field, crossing paths with computer" +
                " education has become indispensable. In a country like India where most people are deprived of basic necessities" +
                " for life, computer education for these underprivileged children is a distant dream. Keeping the current scenario" +
                " in mind, Jagriti was proposed as a part of Fast Forward India to impart basic computer education free of cost" +
                " to the underprivileged children in and around Dhanbad. Jagriti started its functioning in 2008 and since then" +
                " has been actively involved in achieving its goals and fulfilling this cause.\n" +
                "\n" +
                "We are trying to empower them with basic computer education needs so that they will be able to make their stand" +
                "in this computer-oriented world.";
        textViewAboutJagriti.setText(s);
    }
}
