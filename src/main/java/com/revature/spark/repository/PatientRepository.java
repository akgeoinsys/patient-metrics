package com.revature.spark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.spark.beans.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
