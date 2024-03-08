package com.NamanJain.HealthNew.service;

import com.NamanJain.HealthNew.entity.Hospital;
import com.NamanJain.HealthNew.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class HospitalServieImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    @Override
    public List<Hospital> fetchHospital() {
        return hospitalRepository.findAll();
    }

    @Override
    public Hospital fetchHospitalById(Long hospitalId) {
        return hospitalRepository.findById(hospitalId).get();
    }

    @Override
    public void deleteHospitalById(Long hospitalId) {
        hospitalRepository.deleteById(hospitalId);
    }

    @Override
    public Hospital updateHospital(Long hospitalId, Hospital hospital) {
        Hospital hospitalDB = hospitalRepository.findById(hospitalId).get();

        if (Objects.nonNull(hospital.getHospitalName()) &&
                !"".equalsIgnoreCase(hospital.getHospitalName())) {
            hospitalDB.setHospitalName(hospitalDB.getHospitalName());
        }

        if (Objects.nonNull(hospital.getHospitalNumber()) &&
                !"".equalsIgnoreCase(hospital.getHospitalNumber())) {
            hospitalDB.setHospitalNumber(hospitalDB.getHospitalNumber());
        }

        if (Objects.nonNull(hospital.getHospitalAddress()) &&
                !"".equalsIgnoreCase(hospital.getHospitalAddress())) {
            hospitalDB.setHospitalAddress(hospitalDB.getHospitalAddress());
        }
        return hospitalRepository.save(hospitalDB);
    }

    @Override
    public Hospital fetchHospitalByName(String hospitalName) {
        return hospitalRepository.findByHospitalNameIgnoreCase(hospitalName);
    }

    @Override
    public Hospital fetchHospitalByCity(String hospitalCity) {
        return hospitalRepository.findByHospitalCity(hospitalCity);
    }

}
