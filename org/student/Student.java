package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Inside class Student and method studentName()");
	}
	public void studentDept()
	{
		System.out.println("Inside class Student and method studentDept()");
	}
	public void studentId()
	{
		System.out.println("Inside class Student and method studentId()");
	}
	public static void main(String[] args)
	{
		Student stud= new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentDept();
		stud.studentName();
		stud.studentId();

	}
}
