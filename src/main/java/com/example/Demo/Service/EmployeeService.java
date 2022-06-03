package com.example.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Demo.model.EmployeePayrollData;

@Service
public class EmployeeService implements IEmployeeService {

	@Override
	public EmployeePayrollData AddEmployeeData(EmployeePayrollData empdata) {
		
		return empdata;
	}

	@Override
	public EmployeePayrollData FindEmployeeData(int empId) {
		EmployeePayrollData empdata =null;
		empdata = new EmployeePayrollData(1,"Bharath S",20000);
		return empdata;
	}

	@Override
	public List<EmployeePayrollData> FindData() {
		List<EmployeePayrollData> emplist = new ArrayList<EmployeePayrollData>();
		emplist.add(new EmployeePayrollData());
		return emplist;
	}

	@Override
	public EmployeePayrollData updateEmployeeData(EmployeePayrollData empdata) {
		empdata = new EmployeePayrollData(1,"Bharath",20000);
		return empdata;
	}

	@Override
	public void DeleteData(int empId) {
		
		
	}

	
	

}