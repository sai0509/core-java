package com.hcl.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.student.dao.StudentDao;
import com.hcl.student.dao.StudentDaoImpl;
import com.hcl.student.model.Student;


@Service
public class StudentServiceImpl implements StudentService {

@Autowired
StudentDao d;
	public boolean addStudent(Student st) {
		return d.addStudent(st);
	}

	public boolean updateStudent(Student st) {
		return d.updateStudent(st);
	}

	public Student getStudent(int Rollnum) {
		return d.getStudent(Rollnum);
	}

}
