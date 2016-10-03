package com.murillo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.murillo.models.Doctor;
import com.murillo.repositories.DoctorRepository;

@Component
public class DoctorService {
	
	@Autowired
	DoctorRepository doctorRepo;
	
	public List<Doctor> processDoctors(Doctor d) {
		
		List<Doctor> processedDoctors = (List<Doctor>) doctorRepo.findAll();
		
		
		return processedDoctors;
		
		
	}
	
	/*  private Long id;
		private String firstName;
		private String middleName;
		private String lastName;
		private String address1;
		private String phoneNumber;
		private String age;
		private String sex;
		private String schoolAttended;
		private String academicDegree;
		private String specialityArea;
		private String availablityAfterHours;
		private String personalityType;
		private String patientsSaved;
		private String patientsServed;
		private String fatalities;
		private String yearsOfExperience;
		private String positiveReviews;
		private String negativeReviews;
		private String officeLocation;
	 
	  
	  */

}
