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
//				addGrade();
				break;
			case 3:
//				viewReport();
				break;
			case 4:
//				viewAllStudents();
				break;
			case 5:
				System.out.println("\n  Thank you for using Grade Tracker!");
				System.out.println("  Process finished with exit code 0");
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
        
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Roll No: ");
        String rollno = sc.nextLine();
        
        Student s = new Student(name, rollno);
        student.add(s);
        
        System.out.println();
        System.out.println("  Student added successfully!");
        System.out.println("  Name  : " + name);
        System.out.println("  Roll  : " + rollno);
        System.out.println();
	}

}