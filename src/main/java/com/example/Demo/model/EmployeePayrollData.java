package com.example.Demo.model;


public class EmployeePayrollData {

	private int empId;
	private String empName;
	private long empSalary;

	public EmployeePayrollData() {

	}

	public EmployeePayrollData(int empId,String empName,long empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

}