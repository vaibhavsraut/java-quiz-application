package com.velocity.quizapp.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.velocity.quizapp.admin.Question;


public class StudentServicesImpl implements StudentServices{
       
	Connection con = null;
	PreparedStatement ps = null;
	@Override
	public void registerStudent(String firstName,String lastName,String userName,String password,String city,String email,String mobile_number) throws SQLException {
		
			try {
				
				
			getConnection();
			ps = con.prepareStatement("insert into registration_details(firstName,lastName,username,password,city,email,mobileNumber) values(?,?,?,?,?,?,?)");

			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, userName);
			ps.setString(4, password);
			ps.setString(5, city);
			ps.setString(6, email);
			ps.setString(7, mobile_number);
			  
			ps.executeUpdate();
			System.out.println("Successfully Registered");
			
			} catch (Exception e) {
				
				System.out.println("Username already existed\nPlease enter different Username");
			}finally {
				con.close();
				ps.close();
			}
	}

	@Override
	public void studentLogin(String username, String password) throws SQLException {
		
		try {

			con = getConnection();

			ps = con.prepareStatement("select * from registration_details where username=? and password=?");

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Successfully Login..");
			} else {
				System.out.println("Incorrect Username or Password");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			ps.close();
		}

	}

	@Override
	public void startQuiz(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void submitQuiz(Student student, List<String> answers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Result getResult(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "Root");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	
	

	

	
	

}
