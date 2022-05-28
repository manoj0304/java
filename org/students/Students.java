package org.students;

import org.department.Department;

public class Students extends Department {
public void studentName() {
	System.out.println("Manoj");
}
	public void studentDept() {
		System.out.println("Mechanical");
	}
	public void studentId() {
		System.out.println("180021601039");
	}	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.collageName();
		stud.CollegeCode();
		stud.CollegeRank();
		stud.deptName();
		stud.studentDept();
		stud.studentId();
		stud.studentName();
	}
}
