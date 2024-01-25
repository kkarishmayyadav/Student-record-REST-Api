package com.studentdetail.student.Entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class StudentRecord {
	
	@Id
	private int scholarNo;
	private String name;
	private String fatherName;
	private String motherName;
	private int standard;
	private String section;
	
	public StudentRecord(int scholarNo, String name, String fatherName, String motherName, int standard,
			String section) {
		super();
		this.scholarNo = scholarNo;
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.standard = standard;
		this.section = section;
	}
	
	public StudentRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getScholarNo() {
		return scholarNo;
	}
	public void setScholarNo(int scholarNo) {
		this.scholarNo = scholarNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "StudentRecord [scholarNo=" + scholarNo + ", name=" + name + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", standard=" + standard + ", section=" + section + "]";
	}
	
	
	
	

}
