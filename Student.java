package student_grade_tracker;

import java.util.ArrayList;

class Student {
	private String name;
	private String rollNo;
	
	private ArrayList<Grade> grades;
	
	public Student(String name, String rollNo){
		this.name = name;
		this.rollNo = rollNo;
		this.grades = new ArrayList<>();
	}
	
	/* (not necessary)
	//Setter Method - Name
	public void setName(String name) {
		this.name = name;
	}
	*/
	
	//Getter Methods - Name, RollNo
	public String getName() {
		return name;
	}
	
	public String getRollNo() {
		return rollNo;
	}
	
	public void addGrade(Grade grade) {
		grades.add(grade);
	}
	
}
