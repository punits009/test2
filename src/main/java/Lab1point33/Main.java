package Lab1point33;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring254.xml");
		SBU sbu = context.getBean("BU", SBU.class);

		System.out.println("SBU details");
		System.out.println("---------------------");
		System.out.println("SBU Id : "+sbu.getSbuId());
		System.out.println("SBU Head : "+sbu.getSbuHead());
		System.out.println("SBU Name : "+sbu.getSbuName());

		
		System.out.println("---------------------");
		System.out.println("Employee details");
		System.out.println("---------------------");
		List<Employee> e=sbu.getEmpList();
		for(Employee emp2:e){
			System.out.println("empId="+emp2.getEmployeeId()+" "+"empName="+emp2.getEmployeeName()+" "+"empSalary="+emp2.getSalary());
		}

	}

}