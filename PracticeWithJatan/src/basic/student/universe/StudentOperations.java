package basic.student.universe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class StudentOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		System.out.println("Object = "+obj);
		Student s1 = new Student();
		s1.setName("Jal");
		s1.setRollNo(101);
		Student s2 = new Student();
		s2.setName("Jatan");
		s2.setRollNo(102);
		Student s3 = new Student();
		s3.setName("Ajay");
		s3.setRollNo(103);
		Student s4 = new Student();
		s4.setName("Vijay");
		s4.setRollNo(104);
		Student s5 = new Student();
		s5.setName("Veeru");
		s5.setRollNo(105);
		Student s6 = new Student();
		s6.setName("Jay");
		s6.setRollNo(106);
		Student[] students = {s1, s2, s3, s4, s5, s6};
		for(Student s:students) {
			s.printStudentData();
			System.out.println(s);
			System.out.println(s.toString());
		}
		Student.setCollege("xyz");
		for(Student s : students) {
			System.out.println(s);
		}
		
		
		Map<Integer, Student> classA = new HashMap<>();
		Map<Integer, Student> classB = new HashMap<>();
		int count = 1;
		for(Student student : students) {
			if(count%2==0)
				classA.put(student.getRollNo(), student);
			else
				classB.put(student.getRollNo(), student);
			count++;
		}
		System.out.println("ClassA:");
		printMap(classA);
		System.out.println("ClassB:");
		printMap(classB);
		classA.putAll(classB);
		System.out.println("New ClassA:");
		printMap(classA);
		System.out.println("Printing with entry set..."); 
		printMapWithEntrySet(classA);
	}
	public static void printMap(Map<Integer, Student> map) {
		Set<Integer> keySet = map.keySet();
		for(Integer key : keySet) {
			System.out.println("Key : "+key+", Value: "+map.get(key));
		}
	}
	public static void printMapWithEntrySet(Map<Integer, Student> map) {
		for(Map.Entry<Integer, Student> studentEntry : map.entrySet()) {
			System.out.println(studentEntry.getKey()+" -> "+ studentEntry.getValue());
		}
	}
}
