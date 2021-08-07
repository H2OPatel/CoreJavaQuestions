package com.java.object.practice;

public class Employee {
	
	private int empNo;
	private String empName;
	private String address;
	private String state;
	private int zipcode;
	private long phone;
	private int expInYears;
	private String email;

	private EmpDesignationEnum designation;
	
	
	public Employee(int empNo, String empName, String address, String state, int zipcode, long phone, int expInYears,
			String email, String designation) {
		
		/*
		 * IllegalArgumentException - if the specified enum type has no constant with the specified name, or the specified class object does not represent an enum type
			NullPointerException - if enumType or name is null
		 */
		try {
			this.designation = EmpDesignationEnum.valueOf(designation);
			this.empNo = empNo;
			this.empName = empName;
			this.address = address;
			this.state = state;
			this.zipcode = zipcode;
			this.phone = phone;
			this.expInYears = expInYears;
			this.email = email;
			System.out.println("Employee is created with " + this);
		}
		catch(IllegalArgumentException iae) {
			System.out.println("Invalid Designation, emp cannot be created.");
		}
		catch(NullPointerException ne) {
			System.out.println("Designation can not be NULL");
		}
	}


	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public int getExpInYears() {
		return expInYears;
	}


	public void setExpInYears(int expInYears) {
		this.expInYears = expInYears;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public EmpDesignationEnum getDesignation() {
		return designation;
	}


	public void setDesignation(EmpDesignationEnum designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", address=" + address + ", state=" + state
				+ ", zipcode=" + zipcode + ", phone=" + phone + ", expInYears=" + expInYears + ", email=" + email
				+ ", designation=" + designation + "]";
	}


	
}
