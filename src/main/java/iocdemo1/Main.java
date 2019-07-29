package iocdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	 public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			Employee emp = context.getBean("emp", Employee.class);
			System.out.println("The employee details are:");
			System.out.println(emp.getEid()+" "+emp.geteName()+" "+emp.getSalary()+" "+emp.getBU()+" "+emp.getAge());
			
			
}}
