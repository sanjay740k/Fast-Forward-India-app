package com.example.ffi.bloodline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ffi.R;

public class AchivementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achivements);

        TextView textViewAchivementBloodline = (TextView)findViewById(R.id.textViewAchivementBloodline);
        String s= "Jharkhand State AIDS Control Society (JSACS) has awarded Bloodline as the best Voluntary Blood Donation " +
                "Society of Dhanbad.\n" +
                "\n" +
                "Awareness level of Dhanbad public has gone up significantly with regular awareness programs and nukkad nataks " +
                "organized resulting in a rise in voluntary blood donations.\n" +
                "\n" +
                "With the consistent efforts of Bloodline, the number of donors in PMCH blood bank has gone up from 500 donors" +
                " per year in 2005 to 2500 donors per year in 2010. This has also resulted in considerable improvement in the " +
                "hygienic condition of the blood bank.\n" +
                "\n" +
                "ASER- Surveying organizations surveyed around 30 villages in Dhanbad district. It was done by us, Bloodline" +
                " volunteers on their behalf.\n" +
                "\n" +
                "Apart from blood camps, cases are regularly handled by our volunteers.\n" +
                "\n" +
                "Red Cross Society acknowledges Bloodline. Since 2011, we have received trophies for organizing blood camps " +
                "with highest no. of donations.\n" +
                "\n" +
                "Awarded for highest no of voluntry blood donation in a single day from dhanbad district.\n" +
                "\n" +
                "Bloodline is awarded by Indian Red Cross Society, Dhanbad in association with Voluntary Blood Donors’ Association " +
                "(VBDA) of Jharkhand on the occasion of the birth anniversary of Netaji Subhash Chandra Bose on January 23, 2014.\n" +
                "\n";
        textViewAchivementBloodline.setText(s);
    }
}
