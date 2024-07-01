package com.velocity.quizapp.student;


import java.sql.SQLException;
import java.util.List;

import com.velocity.quizapp.admin.Question;
import com.velocity.quizapp.database.DatabaseServices;

public interface StudentServices extends DatabaseServices{
	void registerStudent(String firstName,String lastName,String userName,String password,String city,String email,String mobile_number) throws SQLException;
	void studentLogin(String username, String password) throws SQLException;
	void startQuiz(Student student);
	List<Question> getAllQuestions();
	void submitQuiz(Student student, List<String> answers);
	Result getResult(Student student);
	
	

}
