package com.studentdetail.student.Dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.studentdetail.student.Entity.StudentRecord;

public interface StudentDao extends JpaRepository<StudentRecord, Integer>{

}
