package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TeacherUpdateDataController {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		TeacherService teacherService = new TeacherService(); // we are sending student data to service class
		boolean t = teacherService.updateTeacher(1);
		System.out.println(t);

	}

}
