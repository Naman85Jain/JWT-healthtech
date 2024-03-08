package com.NamanJain.HealthNew.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long hospitalId;
    private String hospitalName;
    private String hospitalNumber;
    private String hospitalAddress;
    private String hospitalCity;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(String hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public Hospital(Long hospitalId, String hospitalName, String hospitalNumber, String hospitalAddress, String hospitalCity) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalNumber = hospitalNumber;
        this.hospitalAddress = hospitalAddress;
        this.hospitalCity = hospitalCity;
    }

    public Hospital() {
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalNumber='" + hospitalNumber + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", hospitalCity='" + hospitalCity + '\'' +
                '}';
    }

}
