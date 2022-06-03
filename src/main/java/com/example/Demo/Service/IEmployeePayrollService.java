package com.example.Demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;



import com.example.Demo.model.EmployeePayrollData;

@Service
public interface IEmployeePayrollService {

	EmployeePayrollData AddEmployeeData(EmployeePayrollData empdata);
	EmployeePayrollData FindEmployeeData(int empId);
	List<EmployeePayrollData>FindData();
	EmployeePayrollData updateEmployeeData(EmployeePayrollData empdata);
	void DeleteData(int empId);
}