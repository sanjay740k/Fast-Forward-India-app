package com.example.ffi.disha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class DishaAchivementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disha_achivements);

        TextView textViewAchivementDisha = (TextView)findViewById(R.id.textViewAchivementDisha);
        String s="50+ counselling sessions have been held in more than 6 schools across Dhanbad so far.\n" +
                "\n" +
                "Successfully conducted “Petrowalk”, in association with SPE, a counselling session which aimed at" +
                " providing insight into Petroleum Engineering.\n" +
                "\n" +
                "A science exhibition was organised in ISM campus in SPARX the annual techno management fest in " +
                "association with IEEE.\n" +
                "\n" +
                "Collaborated with Medhavi Foundation a Delhi based NGO with similar prospects and experienced" +
                " professionals in the field of career counseling started a new project EDU-DISHA.\n" +
                "\n" +
                "Under the project EDU-DISHA, 4000+ students were helped through phonetic counseling regarding " +
                "any problem related to the students.\n" +
                "\n" +
                "Under the project EDU-DISHA, 4000+ students were helped through phonetic counseling regarding any" +
                " problem related to the students.\n";
        textViewAchivementDisha.setText(s);
    }
}
