package com.example.one.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.one.model.Medicine;
import com.example.one.repository.MedicineRepo;

@Service
public class MedicineService{
       @Autowired
       public MedicineRepo medicineRepo;

       public Medicine saveMedicine(Medicine medicine)
       {
            return medicineRepo.save(medicine);
       } 
        
       public List<Medicine> getAll()
       {
           return medicineRepo.findAll(); 
       }
       public Medicine getMedicine(int medicineId)
       {
            return medicineRepo.findById(medicineId).orElse(null);
       }
}
