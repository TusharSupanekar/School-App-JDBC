package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TeacherDeleteController {
	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		
		TeacherService teacherService=new TeacherService();
		boolean t=teacherService.deleteTeacher(1);
		System.out.println(t);
	}

}
