package com.sixclasses;
class Student {
	@Override
	public String toString() {
		return "Student name = " + name + ", id = " + id + ", subject = " + subject + ", fees = " + fees ;
	}

	public Student(String name, int id, String subject, int fees) {
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.fees = fees;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	private String name;
	private int id;
	private String subject;
	private int fees;
	public static void main(String args[]) {

		Student s1=new Student("Maheedhar",0145, "Java ", 999);
		System.out.println(s1);
	}
}

