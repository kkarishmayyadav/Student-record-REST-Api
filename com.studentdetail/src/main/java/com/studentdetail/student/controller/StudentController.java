package com.studentdetail.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentdetail.student.Entity.StudentRecord;
import com.studentdetail.student.services.StudentService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	//Get students record
	
	@GetMapping("/get")
	public List<StudentRecord> getStudentRecord() {
		return this.studentService.getRecord();
	}
	
	@GetMapping("/getById/{studentID}")
	public StudentRecord getRecordBy(@PathVariable int studentID) {
		return this.studentService.getRecordBy(studentID);
		
	}
	
	@PostMapping("/add")
	public StudentRecord addRecord(@RequestBody StudentRecord studentRecord) {
		 return this.studentService.addRecord(studentRecord);
	}

	@PutMapping("/update")
	public StudentRecord updateRecord(@RequestBody  StudentRecord studentRecord) {
		return this.studentService.updateRecord(studentRecord);
		
	}
	
	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<HttpStatus> deleteRecord(@PathVariable int studentId) {
		try {
			this.studentService.deleteRecord(studentId);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
}
