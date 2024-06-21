package com.codegnan.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codegnan.entity.Student;


public class HibernateTest {
	public static void main(String[] args) {
		// Load the Hibernate configuration file and build the session factory
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Open a new session
		Session session = sessionFactory.openSession();

		// Begin a transaction
		Transaction transaction = session.beginTransaction();

		// Create a new student object and set the properties
		Student student = new Student();
		student.setStudentId(1); // Ensure that studentId is set
		student.setFirstName("John");
		student.setLastName("Doe");
		student.setClassName("10A");
		student.setRollNo("R001");
		student.setAge(15);

		// Save the student object
		session.save(student);

		// Commit the transaction
		transaction.commit();

		// Close the session
		session.close();
		sessionFactory.close();

		System.out.println("Student record inserted successfully");
	}
}
