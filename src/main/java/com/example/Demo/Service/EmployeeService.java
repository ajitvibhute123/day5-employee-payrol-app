package com.example.Demo.Service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Demo.model.EmployeePayrollData;

@Service
public class EmployeeService implements IEmployeePayrollService {

	private List<EmployeePayrollData> emplist = new ArrayList<>();

	@Override
	public EmployeePayrollData AddEmployeeData(EmployeePayrollData empdata) {
		emplist.add(empdata);
		return empdata;
	}

	@Override
	public EmployeePayrollData FindEmployeeData(int empId) {
		return emplist.get(empId - 1);
	}

	@Override
	public List<EmployeePayrollData> FindData() {
		return emplist;
	}

	@Override
	public EmployeePayrollData updateEmployeeData(EmployeePayrollData empdata) {

		empdata.setEmpId(1);
		empdata.setEmpName("Bharath S");
		empdata.setEmpSalary(50000);

		emplist.set(1, empdata);
		return empdata;
	}

//	@Override
//	public EmployeePayrollData updateEmployeeData( EmployeePayrollData empdata) {
//		int empId=0;
//		empdata.setEmpId(empId);
//		String name = "";
//		empdata=empdata.setEmpName(name);
//		long salary = 0;
//		empdata=empdata.setEmpSalary(salary);
//		
//		emplist.set(empId-1,empdata);
//		return empdata;
//	}

	@Override
	public void DeleteData(int empId) {
		emplist.remove(empId - 1);

	}

}