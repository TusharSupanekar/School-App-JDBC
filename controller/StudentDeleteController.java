package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentDeleteController {
	public static void main(String[] args) {

		Student student = new Student();

		StudentService studentService = new StudentService();
		boolean s = studentService.deleteStudentById(1);
		System.out.println(s);

	}

}
