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
	
	public boolean getTeacher(int id) {
		boolean t=teacherDao.getTeacher(id);
		return t;
	}
	public boolean updateTeacher(int id) {
		boolean t=teacherDao.updateTeacher(id);
		return t;
	}


	


}
