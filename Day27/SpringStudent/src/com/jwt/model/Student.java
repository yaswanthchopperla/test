package com.jwt.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column
	private int rollNum;

	@Column(name="sname")
	private String sname;

	@Column
	private int age;

	@Column
	private String gender;
	
	@Column
	private String country;
	
	@Column(name="DateOfJoin")
	private Date dateOfJoin;
	
	@Column(name="FinalScore")
	private float finalScore;
	
	@Transient
	private String grade;

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public float getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(float finalScore) {
		this.finalScore = finalScore;
	}

	public String getGrade() {
		Grade gd = (float x) -> { String grade= x<=35? "FAIL" :  x<=60? "AVEREAGE" :  x<=75? "FIRSTCLASS" : "DISTINCTION"; return grade ;}; 
		return gd.grade(finalScore);
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	
	
}
