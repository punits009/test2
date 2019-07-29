package iocdemo1;

import java.util.List;

public class Employee {
	private int eid;
	private String eName;
	private double salary;
	private String BU;
	private int age;
	
	public Employee(int eid, String eName, double salary, String bU, int age) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
		BU = bU;
		this.age = age;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBU() {
		return BU;
	}

	public void setBU(String bU) {
		BU = bU;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
	