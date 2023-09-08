package com.school.service;

import com.school.dao.TeacherDao;
import com.school.dto.Student;
import com.school.dto.Teacher;

public class TeacherService {
	TeacherDao teacherDao=new TeacherDao();
	
	public Teacher saveTeacher(Teacher teacher) {
		
		Teacher t=teacherDao.saveTeacher(teacher);
		return t;
		
	}
	public boolean deleteTeacher(int id) {
		return teacherDao.deleteTeacher(id);
	}
	
	public Teacher getTeacher() {
		Teacher t=teacherDao.getTeacher();
		return t;
	}
	public Teacher updateTeacher() {
		Teacher t=teacherDao.updateTeacher();
		return t;
	}


	


}
