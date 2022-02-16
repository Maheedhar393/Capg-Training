package com.sixclasses;

public class Employee {

	private String company;
	private String ID;
	private String role;
	private int salary;
	Employee(String company,String ID,String role,int salary){
		this.role=role;
		this.company=company;
		this.ID=ID;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Company : "+company+", ID : "+ID+", role : "+role+" ,salary : "+salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m=new Employee("Capgemini","CAPG458","Analyst",400000);
		System.out.println(m);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
