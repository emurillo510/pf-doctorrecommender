package com.murillo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.murillo.models.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long>{

}
