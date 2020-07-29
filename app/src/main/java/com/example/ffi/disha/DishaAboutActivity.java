package com.example.ffi.disha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class DishaAboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disha_about);

        TextView textViewAboutDisha = (TextView)findViewById(R.id.textViewAboutDisha);
        String s="What should I choose as a viable career option?\n" +
                "How do I prepare myself for it?\n" +
                "What all subjects do I need to study?\n" +
                "What’s the degree I need to acquire?\n" +
                "Which is the best college I could enroll into for this?\n" +
                "These questions are what a student faces while preparing for further studies and we people, at Disha, tackle " +
                "and solve, for students in schools of Dhanbad, Jharkhand. These students have a very little knowledge regarding " +
                "viable career options. We aim to bring down this lack of information by making them aware of the various " +
                "career fields there are, which are suitable for them and how they can pursue them by providing them the " +
                "necessary information like about nearby colleges, fee structure, etc. DISHA volunteers organize counseling" +
                " sessions in schools and make the students aware of the aspects of careers. The volunteers are trained by" +
                " the experienced volunteers. The volunteers are also benefitted along with the students as they get the " +
                "opportunity to fulfill their social responsibilities towards the society, along with the enhancement of" +
                " their skills.\n";
        textViewAboutDisha.setText(s);
    }
}
