package com.example.ffi.bloodline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView textViewAboutBloodLine = (TextView)findViewById(R.id.textViewAboutBloodline);
        String s="Bloodline was started in 2007 sighting the lack of awareness among people in this part of the country regarding " +
                "the importance of blood donation. It was a major challenge since the situation was further hampered by the low " +
                "literacy rate and the backward economy of this region. Even before man understood the true nature of blood and its" +
                " functions, the importance of blood for the human body remained disputed. One simple reason for this was the basic " +
                "understanding that excessive loss of blood can cause death. But unlike old times when a serious injury, AIDS or a " +
                "pregnancy complication would mean certain death, the improvement in blood preservation technology has made it " +
                "possible to transfuse blood from a healthy person to one in need even if a donor with the same blood group isn’t " +
                "readily available. However, even today, the demand exceeds the available preserved blood mostly due to lack of " +
                "voluntary donations owing to little awareness and misconceptions about safe blood donations. One of the most " +
                "ambitious and unique projects by a student run NGO, “Bloodline” is a voluntary blood donation society under " +
                "Fast Forward India. Bloodline caters to the needs of blood transfusion of people residing in Dhanbad and adjacent " +
                "areas. Our aim is to spread awareness about voluntary blood donations and to encourage people towards doing it " +
                "regularly. In India, the annual collection of blood is only 5.5-6 million units against the requirement of about " +
                "8.5 million units. It is sad that if only 3% of India's eligible population regularly donates their blood, there" +
                " will be no shortage of blood and its components in blood banks. This would mean that a significant number of " +
                "deaths could be avoided if people donate blood regularly and voluntarily so that safe blood is always available." +
                " But the main reason behind this sadistic situation is the unawareness, myths and misconceptions that are still" +
                " obsessing the minds of Indian people even in the 21st Century." +
                "\n";
        textViewAboutBloodLine.setText(s);

    }
}
