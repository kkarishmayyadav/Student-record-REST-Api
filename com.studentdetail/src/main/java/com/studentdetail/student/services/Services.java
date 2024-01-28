package com.studentdetail.student.services;


//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdetail.student.Dao.StudentDao;
import com.studentdetail.student.Entity.StudentRecord;

@Service
public class Services implements StudentService{
	
	//Creating StudentdDao variable
	
	@Autowired
	private StudentDao studentDao;
	
	
	//Creating method to access(GET) all record of student from table
	@Override
	public List<StudentRecord> getRecord() {
		return studentDao.findAll();
	}
	
	//Creating Method to access(GET) specific record on the Basis of Scholar Number
	@Override
	public StudentRecord getRecordBy(int studentID) {
		StudentRecord studentRecord= studentDao.findById(studentID).get();
		return studentRecord;
	}
	
	//Creating method to PUT(update) Existing entry
	@Override
	public StudentRecord updateRecord(StudentRecord studentRecord) {
		return studentDao.save(studentRecord);
	}

	//Creating method to POST(add) new entry
	@Override
	public StudentRecord addRecord(StudentRecord studentRecord) {
		return studentDao.save(studentRecord);
	}

	//Delete selected Student
	@Override
	public void deleteRecord(int studentId) {
		StudentRecord record=  studentDao.getReferenceById(studentId);
		studentDao.delete(record);
	}
	
	}

