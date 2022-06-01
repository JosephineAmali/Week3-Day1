package org.system;

public class Student extends Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		
		stu.deptName();
		
		stu.studentName();
		stu.studentDept();
		stu.studentId();

	}
	public void studentName()
	{
		System.out.println("studentName");
	}
	public void studentDept() {
		System.out.println("studentDept");
		
	}
	public void studentId() {
		System.out.println("studentId");
		
	}
	

}
