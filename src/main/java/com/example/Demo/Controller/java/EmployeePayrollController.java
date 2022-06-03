package com.example.Demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.DTO.ResponseDTO;
import com.example.Demo.model.EmployeePayrollData;



@RestController
@RequestMapping("/Employee")
public class EmployeePayrollController {
	
	/**
	 * Adding Employee Data with Employee Id,Name And Salary
	 * @param empdata
	 * @return : in ResponseDTO, Message and data
	 */

	@PostMapping("/Add")
	public ResponseEntity<ResponseDTO> getEmployeeData(@RequestBody EmployeePayrollData empdata){
		ResponseDTO respDTO = new ResponseDTO("Created Employee Data",empdata);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	/**
	 * Finding Employee Data With EmployeeId
	 * @param empId
	 * @return : in ResponseDTO, Message and data - Employee Id
	 */
	
	@GetMapping("/Find/{empId}")
	public ResponseEntity<ResponseDTO> GetEmployeeData(@PathVariable int empId){
		ResponseDTO respDTO = new ResponseDTO("Employee Found ",empId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	/**
	 * Updating Employee Data 
	 * @param empdata
	 * @return : Updated Employee data 
	 */
	
	@PutMapping("/Edit")
	public ResponseEntity<ResponseDTO> EditEmployeeData(@RequestBody EmployeePayrollData empdata){
		ResponseDTO respDTO = new ResponseDTO("Employee Data Updated Successfully",empdata);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	/**
	 * Deleting Employee Data With Employee Id
	 * @param empId
	 * @return : Deleted Employee Id
	 */
	
	@DeleteMapping("/Delete/{empId}")
	public ResponseEntity<ResponseDTO> DeleteEmployeData(@PathVariable int empId){
		ResponseDTO respDTO = new ResponseDTO("Employee Data Deleted Successfully","Deleted Id:"+empId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}