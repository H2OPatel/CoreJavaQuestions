package basic.student.universe;

public class Student {
	private int rollNo;
	private String name;
	private static String college = "ITS";
	/*public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}*/
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCollege() {
		return college;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	public void printStudentData() {
		System.out.print(getName() + ", ");
		System.out.print(getRollNo() + ", ");
		System.out.print(getCollege());
		System.out.println();
	}
	
	//toString
	
	@Override
	public String toString() {
		return getName() + ", " + getRollNo() + ", " + getCollege();
	}
	
}
