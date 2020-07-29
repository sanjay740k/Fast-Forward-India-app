package com.example.ffi.bloodline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ffi.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddCaseActivity extends AppCompatActivity {

    EditText patientName,relativeName,date,relation,diesease,mobileNoRelative,bloodGroup,hospitalPatient,
    bloodBank,volunteer,mobileNoVolunteer,donar,mobileNoDonar,hospitalBDonate;
    Button submit;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_case);

        patientName = (EditText)findViewById(R.id.editTextPatientNameCHR);
        relativeName = (EditText)findViewById(R.id.editTextRelativeNameCHR);
        date = (EditText)findViewById(R.id.editTextDateCHR);
        relation = (EditText)findViewById(R.id.editTextRelationCHR);
        diesease = (EditText)findViewById(R.id.editTextDiseasCHR);
        mobileNoRelative = (EditText)findViewById(R.id.editTextRMNumberCHR);
        bloodGroup = (EditText)findViewById(R.id.editTextBloodGroupCHR);
        hospitalPatient = (EditText)findViewById(R.id.editTextPHNameCHR);
        bloodBank = (EditText)findViewById(R.id.editTextBBankCHR);
        volunteer = (EditText)findViewById(R.id.editTextVNameCHR);
        mobileNoVolunteer = (EditText)findViewById(R.id.editTextVMNumberCHR);
        donar = (EditText)findViewById(R.id.editTextDNameCHR);
        mobileNoDonar = (EditText)findViewById(R.id.editTextDMNumberCHR);
        hospitalBDonate = (EditText)findViewById(R.id.editTextDHNameCHR);
        submit = (Button) findViewById(R.id.buttonCHR);


        databaseReference = FirebaseDatabase.getInstance().getReference("addCase");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddCase();
            }
        });

    }

    private void AddCase() {
        String patientName0 = patientName.getText().toString().trim();
        String relativeName0 = relativeName.getText().toString().trim();
        String date0 = date.getText().toString().trim();
        String relation0 = relation.getText().toString().trim();
        String diesease0 = diesease.getText().toString().trim();
        String mnRelative0 = mobileNoRelative.getText().toString().trim();
        String bloodGroup0 = bloodGroup.getText().toString().trim();
        String hospitalP0 = hospitalPatient.getText().toString().trim();
        String bloodbank0 = bloodBank.getText().toString().trim();
        String volunteer0 = volunteer.getText().toString().trim();
        String mnVolunteer0 = mobileNoVolunteer.getText().toString().trim();
        String donar0 = donar.getText().toString().trim();
        String mnDonar0 = mobileNoDonar.getText().toString().trim();
        String hospitalBD0 = hospitalBDonate.getText().toString().trim();


        if(!TextUtils.isEmpty(patientName0)){

            String id = databaseReference.push().getKey();
            AddCases addcase = new AddCases(id , patientName0,relativeName0,date0,relation0,diesease0,mnRelative0,
                    bloodGroup0,hospitalP0,bloodbank0,volunteer0,mnVolunteer0,donar0,mnDonar0,hospitalBD0);
            databaseReference.child(id).setValue(addcase);
            Toast.makeText(this, "Entry Added" , Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(this, "You should enter a name" , Toast.LENGTH_LONG).show();
        }
    }
}
