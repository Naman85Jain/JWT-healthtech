package com.NamanJain.HealthNew.controller;

import com.NamanJain.HealthNew.entity.Patient;
import com.NamanJain.HealthNew.service.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patients")
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @GetMapping("/patients")
    public List<Patient> fetchPatientList() {
        return patientService.fetchPatientList();
    }

    @GetMapping("/patients/{id}")
    public Patient fetchPatientById(@PathVariable("id") Long patientId) {
        return patientService.fetchPatientById(patientId);
    }

    @DeleteMapping("/patients/{id}")
    public String deletePatientById(@PathVariable("id") Long patientId) {
        patientService.deletePatientById(patientId);
        return "Patient Info deleted Successfully....!!";
    }

    @PutMapping("/patients/{id}")
    public Patient updatePatient(@PathVariable("id") Long patientId,
                                 @RequestBody Patient patient) {
        return patientService.updatePatient(patientId, patient);
    }

    @GetMapping("/patients~/name/{name}")
    public Patient fetchPatientByName(@PathVariable("name") String patientName) {
        return patientService.fetchPatientByName(patientName);
    }

    Logger logger = LoggerFactory.getLogger(PatientController.class);

    @RequestMapping("/Patienttest")
    public String test() {
        this.logger.warn("This is working message");
        return "Testing message";
    }

}
