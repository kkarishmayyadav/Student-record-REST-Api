package com.studentdetail.student.services;

import java.util.List;

import com.studentdetail.student.Entity.StudentRecord;

public interface StudentService {
	
	public List<StudentRecord> getRecord();
	
	public StudentRecord getRecordBy(int studentID);

	public StudentRecord addRecord(StudentRecord studentRecord);

	public StudentRecord updateRecord(StudentRecord studentRecord);

	public void deleteRecord(int studentId);
		
}
