package com.anudip.session3;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private double salary;

	@java.lang.Override
	public java.lang.String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", salary=" + salary +
				'}';
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(double salary, String name, int id) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return getId() - o.getId();
	}
}
