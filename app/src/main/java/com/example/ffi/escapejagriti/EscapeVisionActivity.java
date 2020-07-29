package com.example.ffi.escapejagriti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class EscapeVisionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape_vision);

        TextView textViewVisionEscape = (TextView)findViewById(R.id.textViewVisionEscape);
        String s="Through ESCAPE we intend to eleminate the communication barrier amoungst masses from different sects of society" +
                " and to instill within our students enhanced speaking skills along with a pleasing personality.\n";
        textViewVisionEscape.setText(s);
    }
}
