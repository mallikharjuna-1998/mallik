package com.codegnan.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.codegnan.beans.Account;
import com.codegnan.beans.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory sf = null;
		Session ses = null;

		cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory();
		ses = sf.openSession();
		Employee emp = (Employee) ses.get("com.codegnan.beans.Employee", "E-111");
		System.out.println("Employee Details");
		System.out.println("	");
		System.out.println("Employee Id	:" + emp.getEid());
		System.out.println("Employee Name	:" + emp.getEname());
		System.out.println("Employee Salary :" + emp.getEsal());
		System.out.println("Employee Address :" + emp.getEaddr());

		Account acc = emp.getAcc();
		System.out.println(acc);
		System.out.println("Account Details");
		System.out.println("	");
		System.out.println("Account Number :" + acc.getAccNo());
		System.out.println("Account Name	:" + acc.getAccName());
		System.out.println("Account Type	:" + acc.getAccType());
		ses.close();
		sf.close();

	}
}
