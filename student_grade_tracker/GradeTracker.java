package student_grade_tracker;

import java.util.ArrayList;
import java.util.Scanner;

class GradeTracker {
	static ArrayList<Student> student = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		while (true) {
			System.out.println("=========================================");
			System.out.println("   Student Grade Tracker  v1.0");
			System.out.println("=========================================");
			System.out.println();
			System.out.println("  1.  Add student");
			System.out.println("  2.  Add grade");
			System.out.println("  3.  View student report");
			System.out.println("  4.  View all students");
			System.out.println("  5.  Exit");
			System.out.println();
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				addStudent();
				break;
			case 2:
				addGrade();
				break;
			case 3:
				viewReport();
				break;
			case 4:
//				viewAllStudents();
				break;
			case 5:
				System.out.println("\n  Thank you for using Grade Tracker!");
				sc.close();
				return;
			default:
				System.out.println("\n  Invalid choice. Please try again.\n");
			}

		}
	}

	private static void addStudent() {
		System.out.println("-----------------------------------------");
		System.out.println("  [ Add New Student ]");
		System.out.println("-----------------------------------------");
		System.out.println();

		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Roll No: ");
		String rollno = sc.nextLine();

		Student s = new Student(name, rollno);
		student.add(s);

		System.out.println();
		System.out.println("  Student added successfully!");
		System.out.println("  Name  : " + name);
		System.out.println("  Roll  : " + rollno);
		System.out.println();
	}

	private static void addGrade() {
		System.out.println("-----------------------------------------");
		System.out.println("  [ Add Grade ]");
		System.out.println("-----------------------------------------");
		System.out.println();

		System.out.print("Enter rollno: ");
		String rollno = sc.nextLine();

		Student match = null;

		for (Student s : student) {
			if (s.getRollNo().equalsIgnoreCase(rollno)) {
				match = s;
				break;
			}
		}

		if (match == null) {
			System.out.println();
			System.out.println("  Error: No student found with roll " + rollno + ".");
			return;
		}

		System.out.println(" Found: " + match.getName() + " (" + match.getRollNo() + ")\n");

		String addMore = "y";

		do {
			System.out.print("Enter Subject Name: ");
			String subject = sc.nextLine();

			System.out.print("Enter Mark (0 - 100): ");
			int mark = sc.nextInt();
			sc.nextLine();

			Grade g = new Grade(subject, mark);
			match.addGrade(g);

			System.out.println();
			System.out.println("  Grade added!");
			System.out.println("  " + match.getName() + "  |  " + subject + ": " + mark);
			System.out.println();

			System.out.print("Add another grade for this student? (y/n): ");
//	        addMore = sc.next().charAt(0);
			addMore = sc.nextLine();
		} while (addMore.equalsIgnoreCase("y"));

		System.out.println();
	}
	
	private static void viewReport() {
		System.out.println("-----------------------------------------");
        System.out.println("  [ Student Report ]");
        System.out.println("-----------------------------------------");
        System.out.println();
        
        System.out.print("Enter roll number: ");
        String rollno = sc.nextLine();
        
        for(Student s : student) {
        	if(s.getRollNo().equalsIgnoreCase(rollno)) {
        		System.out.println();
        		s.generateReport();
        		System.out.println();
        		return;
        	}
        }
        System.out.println("\n  Error: Student not found\n");
	}

}
