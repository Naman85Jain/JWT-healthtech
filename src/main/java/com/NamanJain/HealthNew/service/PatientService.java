package com.NamanJain.HealthNew.service;

import com.NamanJain.HealthNew.entity.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> fetchPatientList();

    public Patient savePatient(Patient patient);

    public Patient fetchPatientById(Long patientId);

    public void deletePatientById(Long patientId);

    public Patient updatePatient(Long patientId, Patient patient);

    public Patient fetchPatientByName(String patientName);
}
