package com.hcl.student.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student {
   private int RollNum;
   private String sName;
   private int Age;
   private String Gender;
   private String Country;
   private Date DateofJoin;
   private int FinalScore;
@Id
@Column(name="RollNum")
public int getRollNum() {
	return RollNum;
}
public void setRollNum(int rollNum) {
	RollNum = rollNum;
}
@Column(name="sName")
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
@Column(name="Age")
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
@Column(name="Gender")
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
@Column(name="Country")
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
@Column(name="DateOfJoin")
public Date getDateofJoin() {
	return DateofJoin;
}
public void setDateofJoin(Date dateofJoin) {
	DateofJoin = dateofJoin;
}
@Column(name="FinalScore")
public int getFinalScore() {
	return FinalScore;
}
public void setFinalScore(int finalScore) {
	FinalScore = finalScore;
}
   
}
