package com.NamanJain.HealthNew.controller;

import com.NamanJain.HealthNew.entity.Hospital;
import com.NamanJain.HealthNew.service.HospitalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @PostMapping("/hospital")
    public Hospital saveHospital(@RequestBody Hospital hospital) {
        return hospitalService.saveHospital(hospital);
    }

    @GetMapping("/hospital")
    public List<Hospital> fetchHospital() {
        return hospitalService.fetchHospital();
    }

    @GetMapping("/hospital/{id}")
    public Hospital fetchHospitalById(@PathVariable("id") Long hospitalId) {
        return hospitalService.fetchHospitalById(hospitalId);
    }

    @DeleteMapping("/hospital/{id}")
    public String deleteHospitalById(@PathVariable("id") Long hospitalId) {
        hospitalService.deleteHospitalById(hospitalId);
        return "Hospital info deleted successfully....!";
    }

    @PutMapping("/hospital/{id}")
    public Hospital updateHospital(@PathVariable("id") Long hospitalId,
                                   @RequestBody Hospital hospital) {
        return hospitalService.updateHospital(hospitalId,hospital);
    }

    @GetMapping("/hospital/name/{name}")
    public Hospital fetchHospitalByName(@PathVariable("name") String hospitalName) {
        return hospitalService.fetchHospitalByName(hospitalName);
    }

    @GetMapping("/hospital/city/{city}")
    public Hospital fetchHospitalByCity(@PathVariable("city") String hospitalCity) {
        return hospitalService.fetchHospitalByCity(hospitalCity);
    }

    Logger logger = LoggerFactory.getLogger(HospitalController.class);

    @RequestMapping("/Hospitaltest")
    public String test() {
        this.logger.warn("This is working message");
        return "Testing message";
    }

}
