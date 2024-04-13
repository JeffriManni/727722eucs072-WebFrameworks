package com.example.one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.one.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository <Medicine,Integer>{
      
}