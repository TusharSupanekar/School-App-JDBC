package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Teacher;

public class TeacherDao {
	HelperClass helperClass= new HelperClass();
	Connection connection=null;
	
	//To get teacher data
	public Teacher getTeacher() {
		connection=helperClass.getConnection();
		String sql="SELECT * FROM teacher";
		try {
			//Create statement
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedstatement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		}
	
	
	//To delete teacher data
	public boolean deleteTeacher(int id) {
		int i=0;
		connection=helperClass.getConnection();
		String sql="DELETE FROM teacher WHERE Id=?";
		
		try {
			//Create Statement
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			//passing values to delimiters
			preparedStatement.setInt(1, id);
			
			//execute statement
			i=preparedStatement.executeUpdate();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(i>=0) {
			return true;
		}else {
			return false;
		}
	
	}
	
	//To save teacher data
	public Teacher saveTeacher(Teacher teacher) {
		connection=helperClass.getConnection();
		String sql="INSERT INTO teacher VALUES(?,?,?)";

		try {
			//Create Statement
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			//pass the values to delimiter/placeholder.
			preparedStatement.setInt(1,teacher.getId());
			preparedStatement.setString(2,teacher.getName());
			preparedStatement.setString(3,teacher.getEmail());
			
			//Execute Statement
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return teacher;

	}

}
