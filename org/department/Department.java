package org.department;

import org.college.College;

public class Department extends College {
public void deptName() {
	System.out.println("Mechanical");
}
public static void main(String[] args) {
	Department dept = new Department();
	dept.collageName();
	dept.CollegeCode();
	dept.CollegeRank();
	dept.deptName();
}
}
