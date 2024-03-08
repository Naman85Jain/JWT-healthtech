package com.NamanJain.HealthNew.service;

import com.NamanJain.HealthNew.entity.Patient;
import com.NamanJain.HealthNew.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> fetchPatientList() {
        return patientRepository.findAll();
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient fetchPatientById(Long patientId) {
        return patientRepository.findById(patientId).get();
    }

    @Override
    public void deletePatientById(Long patientId) {
        patientRepository.deleteById(patientId);
    }

    @Override
    public Patient updatePatient(Long patientId, Patient patient) {
        Patient patDB = patientRepository.findById(patientId).get();

        if(Objects.nonNull(patient.getPatientName()) &&
        !"".equalsIgnoreCase(patient.getPatientName())) {
            patDB.setPatientName(patient.getPatientName());
        }

        if(Objects.nonNull(patient.getPatientAge()) &&
                !"".equalsIgnoreCase(patient.getPatientAge())) {
            patDB.setPatientAge(patient.getPatientAge());
        }

        if(Objects.nonNull(patient.getPatientGender()) &&
                !"".equalsIgnoreCase(patient.getPatientGender())) {
            patDB.setPatientGender(patient.getPatientGender());
        }

        if(Objects.nonNull(patient.getPatientNumber()) &&
                !"".equalsIgnoreCase(patient.getPatientNumber())) {
            patDB.setPatientNumber(patient.getPatientNumber());
        }

        return patientRepository.save(patDB);
    }

    @Override
    public Patient fetchPatientByName(String patientName) {
        return patientRepository.findByPatientNameIgnoreCase(patientName);
    }
}