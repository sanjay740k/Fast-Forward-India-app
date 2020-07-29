package com.example.ffi.escapejagriti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class EscapeAchivementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape_achivements);

        TextView textViewAchivementEscape = (TextView)findViewById(R.id.textViewAchivementEscape);
        String s="ESCAPE follows the methodology of daily teaching, taking into consideration the day to day applications. " +
                "Classes are conducted on a daily basis, including special personality development sessions. Weekly tests " +
                "ensure a regular mapping of the progress, while regular syllabus revisions ensure that the students are up" +
                " to date with the growing trends in society. We also provide required study material and daily practice problems" +
                " (DPP) in English grammar. The personality enhancement sessions include quizzes, elocutions, debates, public " +
                "speaking, talent displays like singing, dance and art. We also help students in developing their talents" +
                " and hobbies through quality guidance from teachers experienced in various fields. ESCAPE also aims at " +
                "developing a strong moral character within the students, inculcating values like discipline and respect.\n";
        textViewAchivementEscape.setText(s);
    }
}
