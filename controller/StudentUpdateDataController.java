package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentUpdateDataController {
	public static void main(String[] args) {
		Student student=new Student();
		StudentService studentService=new StudentService(); //we are sending student data to service class
		Student s=studentService.updateStudent();
		System.out.println(s);

	}

}
