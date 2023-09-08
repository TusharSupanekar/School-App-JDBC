package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	StudentDao studentDao=new StudentDao();

	public Student saveStudent(Student student) {
		Student s= studentDao.saveStudent(student);	//we are sending the student to dao class
		return s;
	}
	
	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}
	
	public Student  getStudent() {
		Student s=studentDao.getStudent();
		return s;
	}

}
