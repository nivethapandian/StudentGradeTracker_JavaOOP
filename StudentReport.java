	package student_grade_tracker;
	
	import java.util.ArrayList;
	import java.util.Scanner;
	
	public class StudentReport {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Student> student = new ArrayList<>();
			
			while(true) {
				
				System.out.println("====================================\n"
						 + "   Student Grade Tracker  v1.0   \n"
						 + "====================================");
				System.out.println(" 1. Add Student \n"
						+ " 2. Add Grade \n"
						+ " 3. View Student Report\n"
						+ " 4. View All Students \n"
						+ " 5. Exit");
				System.out.print("Enter Choice: ");
				
				int choice = sc.nextInt();
				sc.nextLine();
				
				String name ="";
				String rollNo="";
				
				switch(choice) {
				case 1:
					System.out.println("----------------------------\n"
							+ "   [ Add New Student ] \n"
							+ "----------------------------");
					
					System.out.print("Enter Student Name: ");
					name = sc.nextLine();
					
					System.out.print("Enter Student RollNo: ");
					rollNo = sc.nextLine();
					
					//Object Creation for Student
					Student st = new Student(name, rollNo);
					student.add(st);
					
					System.out.println("    \n Added Student Successfully! \n");
					break;
					
				case 2:
					System.out.println("----------------------------\n"
							+ "   [ Add Grade ] \n"
							+ "----------------------------");
					
					System.out.print("Enter roll number: ");
					rollNo = sc.nextLine();
					
					Student match = null;
					for(Student s: student) {
						if(s.getRollNo().equals(rollNo)) {
							match = s;
							break;
						}
					}
					
					if(match != (null)) {
						System.out.println(" Found");
						
						System.out.print("Enter Subject Name: ");
						String subject = sc.nextLine();
						
						System.out.println("Enter Mark (0 - 100): ");
						int mark = sc.nextInt();
						
						//Grade Object
						Grade g = new Grade(subject, mark);
						match.addGrade(g);
						
						System.out.println("Grade added!");
					}
					
					else 
						System.out.println("Error: No student found with rollNo "+rollNo);
						
					break;
					
				case 3:
					System.out.println("----------------------------\n"
							+ "   [ Student Report ] \n"
							+ "----------------------------");
					break;
					
				case 4:
					System.out.println("----------------------------\n"
							+ "   [ All Students ] \n"
							+ "----------------------------");
					break;
					
				case 5: 
					System.out.println("Thank you for using Grade Tracker!");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid Choice");
			}
		}
		}
	
	}
