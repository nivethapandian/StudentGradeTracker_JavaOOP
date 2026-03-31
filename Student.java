package student_grade_tracker;

import java.util.ArrayList;

class Student implements Reportable {
	private String name;
	private String rollNo;

	private ArrayList<Grade> grades;

	public Student(String name, String rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		this.grades = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public ArrayList<Grade> getGrades() {
		return grades;
	}

	public void addGrade(Grade grade) {
		grades.add(grade);
	}
	
	//Average
	public float average() {
		float sum = 0;
		float	avg =0;
		for(Grade gr :grades) {
			sum += gr.getMark();
		}
		try {
		 avg = sum / grades.size();
		}
		catch(Exception e) {}
		finally {
			System.out.print("");
		}
		return avg;
	}
	
	//GradeLetter
	private char gradeLetter() {
		float avg = average();
		if(avg >= 90) return 'O';
		else if (avg >= 80) return 'A';
		else if (avg >= 70) return 'B';
		else if (avg >= 60) return 'C'; 
		else if (avg >= 50) return 'D';
		else return 'F';
	}
	
	
	public Grade highestGrade() {
		Grade maxMark = grades.get(0);
		for(Grade gr : grades) {
			if(gr.getMark() > maxMark.getMark())
				maxMark = gr;
		}
		return maxMark;
	}
	
	public Grade lowestGrade() {
		Grade lowMark = grades.get(0);
		for(Grade gr : grades) {
			if(gr.getMark() < lowMark.getMark())
				lowMark = gr;
		}
		return lowMark;
	}
	
	@Override
	public void generateReport() {
		System.out.println("=========================================");
        System.out.println("  STUDENT REPORT");
        System.out.println("=========================================");
        System.out.println("  Name        : " + name);
        System.out.println("  Roll Number : " + rollNo);
        System.out.println("-----------------------------------------");
        System.out.println("  Subject          Marks");
        System.out.println("  ................................");
        
        if(grades.isEmpty()) {
        	System.out.println(" (No grades recorded yet)");
        }
        else {
        	for(Grade gr : grades) {
        		System.out.printf("  %-16s %d\n", gr.getSubject(), gr.getMark());
        	}
        	System.out.println("  ................................");
            System.out.printf("  Average        :  %.2f\n", average());
        	
        	Grade max = highestGrade();
        	System.out.printf("  Highest        :  %s (%d)\n", max.getSubject(), max.getMark());
        	
        	Grade low = lowestGrade();
        	System.out.printf("  Lowest         :  %s (%d)\n", low.getSubject(), low.getMark());
            System.out.println("");
            System.out.println("  Grade Letter   :  " + gradeLetter());
        }
        System.out.println("=========================================");
	}
	
	@Override
	public String toString() {
        return String.format("  %-7s %-18s %-7.2f %s", rollNo, name, average(), gradeLetter());
	}
}
