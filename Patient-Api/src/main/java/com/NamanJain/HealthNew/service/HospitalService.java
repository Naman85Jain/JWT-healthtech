package com.NamanJain.HealthNew.service;

import com.NamanJain.HealthNew.entity.Hospital;

import java.util.List;

public interface HospitalService {

    public Hospital saveHospital(Hospital hospital);

    public List<Hospital> fetchHospital();

    public Hospital fetchHospitalById(Long hospitalId);

    public void deleteHospitalById(Long hospitalId);

    public Hospital updateHospital(Long hospitalId, Hospital hospital);

    public Hospital fetchHospitalByName(String hospitalName);

    public Hospital fetchHospitalByCity(String hospitalCity);

}
