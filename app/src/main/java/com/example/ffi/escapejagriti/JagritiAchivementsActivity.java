package com.example.ffi.escapejagriti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class JagritiAchivementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jagriti_achivements);

        TextView textViewAchivementJagriti = (TextView)findViewById(R.id.textViewAchivementJagriti);
        String s="Under this project of FFI, the following things have been done for the society: 164 students have been " +
                "imparted computer education in the previous 6 batches successfully at our center. Among 29 inmates from " +
                "KARAGAR JAGRITI CHAPTER, 14 inmates have been retracted on righteous path and now they are earning honestly. " +
                "Dwanda a computer quiz, for the slum students has been organized at annual basis. Tulika a painting " +
                "competition is an annually organized event. Our student Rajni got 1st rank in interview for Biotech. " +
                "course in P.K. Roy memorial College. A student Sachin of our batch has got the Job as computer operator " +
                "in the ISM, Emerald Hostel. \n";
        textViewAchivementJagriti.setText(s);
    }
}
