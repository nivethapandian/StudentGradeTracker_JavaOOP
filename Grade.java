package student_grade_tracker;

class Grade{
	private String subject;
	private int mark;
	
	Grade(String subject, int mark){
		this.subject = subject;
		this.mark = mark;
	}
	
	
	//Setter Methods - Subject, Marks
	/* (not necessary)
	public void setSubject(String subject) {
		this.subject = subject;
	}
	*/
	
	public void setMark(int mark) {
		if(mark >= 0 && mark <= 100) {
			this.mark = mark;
		}
		else
			System.out.println("Invalid Mark!");
	}
	
	//Getter Methods - Subject, Mark
	public String getSubject() {
		return subject;
	}
	
	public int getMark() {
		return mark;
	}
}
