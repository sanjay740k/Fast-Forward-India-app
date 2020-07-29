package com.example.ffi.bloodline;

public class AddCases {

    String caseId;
    String patient_Name;
    String relative_Name;
    String date;
    String relation;
    String disease;
    String numberR;
    String bloodGroup;
    String hospitalP;
    String blood_Bank;
    String volunteer;
    String vNumber;
    String donar;
    String donar_Number;
    String dHospital;

    public AddCases(){

    }

    public AddCases(String caseId, String patient_Name, String relative_Name, String date,
                    String relation, String disease, String numberR, String bloodGroup, String hospitalP,
                    String blood_Bank, String volunteer, String vNumber, String donar, String donar_Number, String dHospital) {
        this.caseId = caseId;
        this.patient_Name = patient_Name;
        this.relative_Name = relative_Name;
        this.date = date;
        this.relation = relation;
        this.disease = disease;
        this.numberR = numberR;
        this.bloodGroup = bloodGroup;
        this.hospitalP = hospitalP;
        this.blood_Bank = blood_Bank;
        this.volunteer = volunteer;
        this.vNumber = vNumber;
        this.donar = donar;
        this.donar_Number = donar_Number;
        this.dHospital = dHospital;
    }

    public String getCaseId() {
        return caseId;
    }

    public String getPatient_Name() {
        return patient_Name;
    }

    public String getRelative_Name() {
        return relative_Name;
    }

    public String getDate() {
        return date;
    }

    public String getRelation() {
        return relation;
    }

    public String getDisease() {
        return disease;
    }

    public String getNumberR() {
        return numberR;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getHospitalP() {
        return hospitalP;
    }

    public String getBlood_Bank() {
        return blood_Bank;
    }

    public String getVolunteer() {
        return volunteer;
    }

    public String getvNumber() {
        return vNumber;
    }

    public String getDonar() {
        return donar;
    }

    public String getDonar_Number() {
        return donar_Number;
    }

    public String getdHospital() {
        return dHospital;
    }
}
