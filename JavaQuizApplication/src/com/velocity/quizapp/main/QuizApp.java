package com.velocity.quizapp.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.velocity.quizapp.student.Student;
import com.velocity.quizapp.student.StudentServicesImpl;

public class QuizApp {

	
	public static void main(String[] args) throws SQLException {
		System.out.println("Welcome to Java Quiz Application");
		System.out.println();
		System.out.println("  User Operation");
		System.out.println();
		System.out.println("  1. Student Registration");
		System.out.println("  2. Student Login");
		System.out.println("  3. Display the list of questions");
		System.out.println("  4. Store Quiz results into database");
		System.out.println("  5. Display Quiz result");
		System.out.println();
		System.out.println("  Admin Operation");
		System.out.println();
		System.out.println("  6. Display all students score as per ascending order");
		System.out.println("  7. Fetch student score by using id");
		System.out.println("  8. Add question with 4 options into database");
		
		StudentServicesImpl ssi = new StudentServicesImpl();
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your choice ");
		int num = scanner.nextInt();
		switch (num) {
		case 1: {
		
			System.out.println("Enter First Name : ");
			String firstName = scanner.next();
			System.out.println("Enter Last Name : ");
			String lastName = scanner.next();
			System.out.println("Enter Username : ");
			String username = scanner.next();
			System.out.println("Enter password : ");
			String password = scanner.next();
			System.out.println("Enter City : ");
			String city = scanner.next();
			System.out.println("Enter Email-id : ");
			String email = scanner.next();
			System.out.println("Enter Mobile Number : ");
			String mobileNumber = scanner.next();
			
			ssi.registerStudent(firstName, lastName, username, password, city, email, mobileNumber);
				
			
		}
		case 2: {
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
		
	}
}
