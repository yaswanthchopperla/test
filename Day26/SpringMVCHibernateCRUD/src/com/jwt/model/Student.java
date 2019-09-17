package com.jwt.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@Column(name="rollNum")
	private int RollNum;

	@Column(name="sname")
	private String sName;

	@Column(name="age")
	private String Age;

	@Column(name="gender")
	private String Gender;

	@Column(name="country")
	private String Country;
    
	@Column(name="dateOfJoin")
	private String DateOfJoin;
	
	@Column(name="FinalScore")
	private String FinalScore;

	public int getRollNum() {
		return RollNum;
	}

	public void setRollNum(int rollNum) {
		this.RollNum = rollNum;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		this.Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

	public String getDateOfJoin() {
		return DateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.DateOfJoin = dateOfJoin;
	}

	public String getFinalScore() {
		return FinalScore;
	}

	public void setFinalScore(String finalScore) {
		this.FinalScore = finalScore;
	}
}