package com.murillo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSchoolAttended() {
		return schoolAttended;
	}
	public void setSchoolAttended(String schoolAttended) {
		this.schoolAttended = schoolAttended;
	}
	public String getAcademicDegree() {
		return academicDegree;
	}
	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}
	public String getSpecialityArea() {
		return specialityArea;
	}
	public void setSpecialityArea(String specialityArea) {
		this.specialityArea = specialityArea;
	}
	public String getAvailablityAfterHours() {
		return availablityAfterHours;
	}
	public void setAvailablityAfterHours(String availablityAfterHours) {
		this.availablityAfterHours = availablityAfterHours;
	}
	public String getPersonalityType() {
		return personalityType;
	}
	public void setPersonalityType(String personalityType) {
		this.personalityType = personalityType;
	}
	public String getPatientsSaved() {
		return patientsSaved;
	}
	public void setPatientsSaved(String patientsSaved) {
		this.patientsSaved = patientsSaved;
	}
	public String getPatientsServed() {
		return patientsServed;
	}
	public void setPatientsServed(String patientsServed) {
		this.patientsServed = patientsServed;
	}
	public String getFatalities() {
		return fatalities;
	}
	public void setFatalities(String fatalities) {
		this.fatalities = fatalities;
	}
	public String getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getPositiveReviews() {
		return positiveReviews;
	}
	public void setPositiveReviews(String positiveReviews) {
		this.positiveReviews = positiveReviews;
	}
	public String getNegativeReviews() {
		return negativeReviews;
	}
	public void setNegativeReviews(String negativeReviews) {
		this.negativeReviews = negativeReviews;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

}
