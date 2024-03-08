package com.NamanJain.HealthNew.repository;

import com.NamanJain.HealthNew.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    public Hospital findByHospitalNameIgnoreCase(String hospitalName);
    public Hospital findByHospitalCity(String hospitalCity);
}
