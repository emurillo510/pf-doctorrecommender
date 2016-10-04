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
					
		processedDoctors = similarAge(processedDoctors, d);
		processedDoctors = similarSex(processedDoctors, d);
		processedDoctors = similarSchools(processedDoctors, d);
		processedDoctors = availablityAfterHours(processedDoctors, d);
		processedDoctors = similarPersonality(processedDoctors, d);
		processedDoctors = similarPatientsSaved(processedDoctors, d);
		processedDoctors = similarPatientsServed(processedDoctors, d);
		processedDoctors = similarFatalities(processedDoctors, d);
		processedDoctors = similarYearsOfExperience(processedDoctors, d);
		processedDoctors = similarNegativeReviews(processedDoctors, d);
		processedDoctors = similarOfficeLocation(processedDoctors, d);
			
		return processedDoctors;
		
	}
	
	public List<Doctor> similarAge(List<Doctor> doctors, Doctor d) {
		
		final int doctorAge = Integer.parseInt(d.getAge());
		final int RANGE = 5;
		final int MIN_AGE = doctorAge - RANGE;
		final int MAX_AGE = doctorAge + RANGE;
		
		for(int i = 0; i < doctors.size(); i++) {
			final int currentDoctorAge = Integer.parseInt(doctors.get(i).getAge());
			if( !(MIN_AGE < currentDoctorAge) && !(currentDoctorAge < MAX_AGE)) {
				doctors.remove(i);
			}	
		}
		
		return doctors;
	}
	
	public List<Doctor> similarSex(List<Doctor> doctors, Doctor d) {
		
		final String doctorSex = d.getSex().toLowerCase().trim();
		
		for(int i = 0; i < doctors.size(); i++) {
			
			final String currentDoctorSex = doctors.get(i).getSex().toLowerCase().trim();
		
			if(!doctorSex.equals(currentDoctorSex)) {
				doctors.remove(i);
			}
		}
		
		return doctors;
	
		
	}
	
	public List<Doctor> similarSchools(List<Doctor> doctors, Doctor d) {
		
		// if doctor academic program ranks within 10 schools
		
		return doctors;
	}
	
	public List<Doctor> similarSpecialityArea(List<Doctor> doctors, int index, Doctor d) {
		
		final String doctorSpecialityArea = d.getSpecialityArea().toLowerCase().trim();
		
		for(int i = 0; i < doctors.size(); i++) {
			final String currentDoctor = doctors.get(i).getSpecialityArea().toLowerCase().trim();
			
			if(!doctorSpecialityArea.equals(currentDoctor)) {
				doctors.remove(i);
			}
		}
		
		
		return doctors;
	}
	
	public List<Doctor> availablityAfterHours(List<Doctor> doctors, Doctor d) {
		
		final String doctorAfterHours = d.getAvailablityAfterHours().toLowerCase().trim();
		
		for(int i = 0; i < doctors.size(); i++) {
			final String currentDoctorAfterHours = doctors.get(i).getAvailablityAfterHours().toLowerCase().trim();
			if(!doctorAfterHours.equals(currentDoctorAfterHours)) {
				doctors.remove(i);
			}
		}
		
		
		
		
		
		
		return doctors;
	}
	
	public List<Doctor> similarPersonality(List<Doctor> doctors, Doctor d) {
		
		final String doctorPersonality = d.getPersonalityType().toLowerCase().trim();
		for(int i = 0; i < doctors.size(); i++) {
			final String currentDoctorsPersonality = doctors.get(i).getPersonalityType().toLowerCase().trim();
			
			if(!doctorPersonality.contains(currentDoctorsPersonality)) {
				doctors.remove(i);
			}
		}
		
		
		
		
		return doctors;
	}
	
	public List<Doctor> similarPatientsSaved(List<Doctor> doctors, Doctor d) {
		
		
		final double doctorPatientsSaved = Integer.parseInt(d.getPatientsSaved());
		final double RANGE = doctorPatientsSaved * 0.10;
		final double MIN_AGE = doctorPatientsSaved - RANGE;
		final double MAX_AGE = doctorPatientsSaved + RANGE;
		
		
		for(int i = 0; i < doctors.size(); i++) {
			final double currentDoctorPatientsSaved = Integer.parseInt(doctors.get(i).getPatientsSaved());
			
			if( !(MIN_AGE < currentDoctorPatientsSaved) && !(currentDoctorPatientsSaved < MAX_AGE)) {
				doctors.remove(i);
			}
		}
		
		return doctors;
	}
	
	public List<Doctor> similarPatientsServed(List<Doctor> doctors, Doctor d) {
		
		final double doctorPatientsServed = Integer.parseInt(d.getPatientsServed());
		final double RANGE = doctorPatientsServed * 0.10;
		final double MIN_AGE = doctorPatientsServed - RANGE;
		final double MAX_AGE = doctorPatientsServed + RANGE;
		
		
		for(int i = 0; i < doctors.size(); i++) {
			final double currentDoctorPatientsServed = Integer.parseInt(doctors.get(i).getPatientsServed());
			if( !(MIN_AGE < currentDoctorPatientsServed) && !(currentDoctorPatientsServed < MAX_AGE)) {
				doctors.remove(i);
			}
		}

		return doctors;
	}
	
	public List<Doctor> similarFatalities(List<Doctor> doctors, Doctor d) {
		
		final double doctorFatalities = Integer.parseInt(d.getFatalities());
		final double RANGE = doctorFatalities * 0.10;
		final double MIN_AGE = doctorFatalities - RANGE;
		final double MAX_AGE = doctorFatalities + RANGE;
		
		for(int i = 0; i < doctors.size(); i++) {
			final double currentDoctorFatalities = Integer.parseInt(doctors.get(i).getFatalities());
			
			if( !(MIN_AGE < currentDoctorFatalities) && !(currentDoctorFatalities < MAX_AGE)) {
				doctors.remove(i);
			}
		}
		return doctors;
	}
	
	public List<Doctor> similarYearsOfExperience(List<Doctor> doctors, Doctor d) {
		
		final int doctorYearsOfExperience = Integer.parseInt(d.getYearsOfExperience());
		final int RANGE = 3;
		final int MIN_AGE = doctorYearsOfExperience - RANGE;
		final int MAX_AGE = doctorYearsOfExperience + RANGE;
		
		
		for(int i = 0; i < doctors.size(); i++) {
			final int currentYearsOfExperience = Integer.parseInt(doctors.get(i).getYearsOfExperience());
			
			if( !(MIN_AGE < currentYearsOfExperience) && !(currentYearsOfExperience < MAX_AGE)) {
				doctors.remove(i);
			}
		}
		
		return doctors;
	}
	
	public List<Doctor> similarNegativeReviews(List<Doctor> doctors, Doctor d) {
		
		final int doctorNegativeReviews = Integer.parseInt(d.getNegativeReviews());
		final int RANGE = 15;
		final int MIN_AGE = doctorNegativeReviews - RANGE;
		final int MAX_AGE = doctorNegativeReviews + RANGE;
		
		
		for(int i = 0; i < doctors.size(); i++) {
			final int currentNegativeReviews = Integer.parseInt(doctors.get(i).getNegativeReviews());
			
			if( !(MIN_AGE < currentNegativeReviews) && !(currentNegativeReviews < MAX_AGE)) {
				doctors.remove(i);
			}
		}
		

		return doctors;
	}
	
	public List<Doctor> similarOfficeLocation(List<Doctor> doctors, Doctor d) {
		
		
		final String doctorSpecialityArea = d.getOfficeLocation().toLowerCase().trim();
		
		for(int i = 0; i < doctors.size(); i++) {
			final String currentDoctor = doctors.get(i).getOfficeLocation().toLowerCase().trim();
			
			if(!doctorSpecialityArea.contains(currentDoctor)) {
				doctors.remove(i);
			}
		}
			

		return doctors;
	}
	
	
	
	
	
	
	/*
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
