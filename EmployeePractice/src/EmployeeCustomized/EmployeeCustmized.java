package EmployeeCustomized;

public class EmployeeCustmized {

	private int empNo;
	private String empName;
	private String address;
	private String state;
	private int zipcode;
	private int phoneNum;
	//private String designation;// manager, lead, analyst
	private DesignationEnum designation;
	private int experienceInYears;
	private String emailAddress;
	private double basicSalory;
	private double hra;
	private double bonus;
	public enum DesignationEnum {
		LEAD, MANAGER, ANALYST;
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
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getDesignation() {
		return designation.toString();
	}
	public void setDesignation(String designation) {
		this.designation = DesignationEnum.valueOf(designation);
	}
	public int getExperienceInYears() {
		return experienceInYears;
	}
	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public double getBasicSalory() {
		return basicSalory;
	}
	public void setBasicSalory(double basicSalory) {
		this.basicSalory = basicSalory;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
