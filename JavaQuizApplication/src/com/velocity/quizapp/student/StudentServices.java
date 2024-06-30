package com.velocity.quizapp.student;

import java.util.List;

import com.velocity.quizapp.admin.Question;
import com.velocity.quizapp.database.DatabaseServices;

public interface StudentServices extends DatabaseServices{
	void registerStudent(Student student);
	Student login(String username, String password);
	void startQuiz(Student student);
	List<Question> getAllQuestions();
	void submitQuiz(Student student, List<String> answers);
	Result getResult(Student student);

}
