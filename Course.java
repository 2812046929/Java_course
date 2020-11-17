package exercise06;

import java.util.ArrayList;

public class Course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course aa = new Course("java");
		aa.addStudent("11");
		aa.addStudent("22");
		aa.dropStudent("11");
		int num = aa.getNumberOfStudents();
		System.out.println(num);
		System.out.println(aa.toString());
	}

	private String courseName;
//	private String[] students = new String[30];
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {

		students.add(student);
		numberOfStudents = students.size();
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	/** Clear the course */
	public void clear() {
		students.clear();
		numberOfStudents = 0;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		students.remove(student);
		numberOfStudents = students.size();

	}

	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode()) + " hahaha";
	}

}
