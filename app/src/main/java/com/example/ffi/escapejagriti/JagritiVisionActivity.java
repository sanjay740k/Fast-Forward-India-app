package com.example.ffi.escapejagriti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class JagritiVisionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jagriti_vision);

        TextView textViewVisionJagriti = (TextView)findViewById(R.id.textViewVisionJagriti);
        String s="this chapter of ffi was started with a vision to empower underprivilage students with computer education " +
                "so that they can stand in this changing era of india, also computer education for those people who are " +
                "diconncted from society and want to change themselves so that they can serve and live in society with " +
                "selfrespect.\n";
        textViewVisionJagriti.setText(s);
    }
}
