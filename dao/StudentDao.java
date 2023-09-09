package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	// To update student data
	public boolean updateStudent(int id) {
		connection = helperClass.getConnection();
		String sql = "UPDATE student set name='tushar',email='tushar@mail.com' WHERE id=?";

		try {
			// create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// pass value to delimiters
			preparedStatement.setInt(1, id);
			// Execute statement
			preparedStatement.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (id > 0) {
			return true;

		} else {
			return false;
		}
	}

	// To get all data
	public boolean getStudent(int id) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM student WHERE Id=?";
		try {
			// Create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (id > 0) {
			return true;
		} else {
			return false;
		}
	}

	// To Delete a student data
	public boolean deleteStudentById(int id) {
		int i = 0;
		connection = helperClass.getConnection();
		String sql = "DELETE FROM student WHERE Id=?";
		try {
			// Created statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passing the values to delimiters/placeholder
			preparedStatement.setInt(1, id);

			// Execute the Statement by executeUpdate
			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	// To Save a Student Data
	public Student saveStudent(Student student) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";
		try {
			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// pass the values to delimiter/placeholder.
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());

			// Execute Statement
			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
	}
}
