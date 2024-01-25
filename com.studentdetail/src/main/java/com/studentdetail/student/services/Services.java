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
	
// --------This code I used for CRUD operation when database not connected----------	
//	List<StudentRecord> list;
//	
//	public Services() {
//		 list=new ArrayList<>();
//		 list.add(new StudentRecord(100, "Ram", "Ramcharan", "Sita", 5, "A"));
//		 list.add(new StudentRecord(101,"Ajay"," Rakesh", "Radha", 5, "C"));
//	}
//
//	@Override
//	public List<StudentRecord> getRecord() {
//		// TODO Auto-generated method stub
//		return list;
//	}
//
//	@Override
//	public StudentRecord getRecordBy(int studentID) {
//		
//		StudentRecord st=null;
//		
//		for(StudentRecord str:list ) {
//			if (str.getScholarNo()==studentID) {
//				st=str;
//				break;
//			}
//		}
//		return st;	
//	}
//
//	@Override
//	public StudentRecord addRecord(StudentRecord studentRecord) {
//		list.add(studentRecord);
//		return studentRecord;
//	}
//	
//	@Override
//	public StudentRecord updateRecord(StudentRecord studentRecord) {
//		list.forEach(e->{
//			if(e.getScholarNo()==studentRecord.getScholarNo()) {
//				e.setName(studentRecord.getName());
//				e.setFatherName(studentRecord.getFatherName());
//				e.setMotherName(studentRecord.getMotherName());
//				e.setStandard(studentRecord.getStandard());
//				e.setSection(studentRecord.getSection());
//			}
//		});
//		return studentRecord;
//	}
//
//	@Override
//	public void deleteRecord(int studentId) {
//		list=this.list.stream().filter(e->e.getScholarNo()!=studentId).collect(Collectors.toList());
//	}

	
	
	//-------------------This code is when DB is Connected---------------------
	
	
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

