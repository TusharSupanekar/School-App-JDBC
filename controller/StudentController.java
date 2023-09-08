package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {
	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setName("Tushar");
		student.setEmail("tushar@mail.com");

		StudentService studentService = new StudentService(); // we are sending student data to service class
		Student s = studentService.saveStudent(student);
		if (s != null) {
			System.out.println(s.getId() + " Saved Sucessfully");
		}
	}
}
