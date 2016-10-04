package com.murillo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.murillo.models.Doctor;
import com.murillo.repositories.DoctorRepository;
import com.murillo.services.DoctorService;

@SpringBootApplication
@EnableJpaRepositories("com.murillo.repositories")
@EntityScan("com.murillo.models")
@ComponentScan("com.murillo.services")
public class PracticefusionDoctorrecommenderApplication {
	
	static Logger logger = Logger.getLogger(PracticefusionDoctorrecommenderApplication.class);
	
	@Autowired
	DoctorService doctorService;

	public static void main(String[] args) {
		SpringApplication.run(PracticefusionDoctorrecommenderApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(DoctorRepository doctorRepo) {
		
		logger.info("Application Start ----------------------------------------------");

		/*
		 * private Long id;
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
		 * */
		Doctor elton = new Doctor();
		elton.setAge("26");
		elton.setSex("male");
		elton.setSchoolAttended("San Jose State University");
		elton.setAcademicDegree("BS");
		elton.setSpecialityArea("Dermatologist");
		elton.setAvailablityAfterHours("yes");
		elton.setPersonalityType("fun");
		elton.setPatientsServed("95");
		elton.setPatientsSaved("101");
		elton.setFatalities("0");
		elton.setYearsOfExperience("3");
		elton.setPositiveReviews("51");
		elton.setNegativeReviews("1");
		elton.setOfficeLocation("San Francisco");
		
		logger.info("Similar Doctor Service ----------------------------------------------");
		for(Doctor d: doctorService.processDoctors(elton)) {
			logger.info(d.getFirstName() + " " + d.getLastName());
			
		}
		logger.info("Similar Doctor Service End----------------------------------------------");
		
		logger.info("Application End ----------------------------------------------");
			
		return null;
	}
}