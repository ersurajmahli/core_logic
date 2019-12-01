package com.logic.collection;

public final class Employee {
	
	private int empId;
	
	private String empName;
	
	private float empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Employee() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		/*
		 * // TODO Auto-generated method stub if(this == obj) return true;
		 * 
		 * if(obj == null||obj.getClass()!=this.getClass()) return false;
		 * 
		 * Employee employee = (Employee) obj;
		 * 
		 * return (employee.empName.equals(this.empName) && employee.empId==this.empId
		 * && employee.empSalary==this.empSalary);
		 */
		return true;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	
}
