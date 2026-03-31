package student_grade_tracker;

class Grade {
	private String subject;
	private int mark;

	Grade(String subject, int mark) {
		this.subject = subject;
		setMark(mark);
	}
	
	public void setMark(int mark) {
		if (mark >= 0 && mark <= 100) {
			this.mark = mark;
		} else {
			System.out.println("Invalid Mark!");
			this.mark = 0;
		}
	}

	public String getSubject() {
		return subject;
	}

	public int getMark() {
		return mark;
	}
}
