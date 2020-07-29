package com.example.ffi.umeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class UmeedAboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umeed_about);

        TextView textViewAboutUmeed = (TextView)findViewById(R.id.textViewAboutUmeed);
        String s="Umeed is the Annual Festival of Fast Forward India. The festival was originally known as 'Carrus' which " +
                "was organised mainly as a career development fest.\n" +
                "\n" +
                "Hope is a beaming star that forever lights us. Sometimes feeble, but often bright. Sometimes weak but often " +
                "strong.\n" +
                "The chapters of Fast Forward India, come together for yet another time, in their constant endeavour of giving " +
                "back to the society. Like Carrus, Umeed is a unique effort of Fast Forward India towards brightening the lives " +
                "of the underprivileged children.\n" +
                "Umeed is a platform that would provide various schools of Dhanbad an opportunity to compete against each other " +
                "and win the Numero Uno title in addition to showcasing the exuberant talents of the underprivileged children.\n" +
                "Following is brief description of the planned events:\n" +
                "• Dance Competition: Nrityangan\n" +
                "• Debate Competition: Resolved\n" +
                "• Quiz Competition: Mastermind\n" +
                "• Science Fair: Einstein’s Playhouse\n" +
                "• Painting Competition: Chitrahar\n" +
                "We, at Fast Forward India, hope that this initiative of ours enables the ray of hope enter the chamber of" +
                " every chaild heart’s that needs it. Umeed, must never never extinguish in sickness, in poverty and in want." +
                " Let the Umeed shine aloft day and night.\n";
        textViewAboutUmeed.setText(s);
    }
}
