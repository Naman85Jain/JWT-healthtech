package com.NamanJain.HealthNew.repository;

import com.NamanJain.HealthNew.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    public Patient findByPatientNameIgnoreCase(String patientName);

}
