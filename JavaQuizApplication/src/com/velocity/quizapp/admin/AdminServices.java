package com.velocity.quizapp.admin;

import java.util.List;

import com.velocity.quizapp.database.DatabaseServices;
import com.velocity.quizapp.student.Student;
import com.velocity.quizapp.student.StudentServices;

public interface AdminServices extends StudentServices, DatabaseServices{
	void addQuestion(Question question);
	List<Student> getAllStudents();
	Student getStudentById(int id);

}
