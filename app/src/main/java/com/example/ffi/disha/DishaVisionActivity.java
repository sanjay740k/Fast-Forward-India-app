package com.example.ffi.disha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class DishaVisionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disha_vision);

        TextView textViewVisionDisha = (TextView)findViewById(R.id.textViewVisionDisha);
        String s="This branch of FFI was started with a vision that DISHA will eradicate, the chimera of misinformation" +
                " and ignorance, so that no student pays the cost because of such things. As in various cases, parents " +
                "are not well-informed over the current career options and are often misguided. Also, there are cases where" +
                " due to financial constraints, higher studies aren’t a priority. DISHA provides the students with a medium " +
                "through which they can explore their options when they complete their 10+2.\n";
        textViewVisionDisha.setText(s);
    }
}
