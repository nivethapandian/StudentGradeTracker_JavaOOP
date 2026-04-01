# Student Grade Tracker

A lightweight, console-based Java application designed to help teachers manage student grades. This project runs entirely in memory and was built specifically to demonstrate core Object-Oriented Programming (OOP) principles.


## Features

**Student Management:** Add new students with a name and a unique roll number.

**Grade Management:** Record integer marks (0-100) for various subjects. A student can have grades for any number of subjects.

**Data Validation:** Prevents adding grades for non-existent students and ensures marks are valid integers.

**Detailed Performance Reports:** Automatically calculates a student's average, identifies their highest and lowest scoring subjects, and assigns a final letter grade (O, A, B, C, D, F).

**Global View:** View a summarized list of all students and their current averages in one place.

## Technologies & Concepts Used

**Language:** Pure Java (JDK 8+)

**Interface:** Command Line / Console

**Storage:** In-memory Collections (ArrayList)

## OOP Principles Demonstrated
This project serves as a practical application of standard Java OOP concepts:

**Classes & Objects:** Uses Student and Grade classes to model real-world entities.

**Encapsulation:** All class properties (like name, marks, grades list) are strictly private. Internal logic, such as the getGradeLetter() calculation, is hidden behind private helper methods to protect the state of the objects.

**Abstraction:** Implements a Reportable interface containing the generateReport() method, separating the what from the how.

**Polymorphism:** Overrides the default Object.toString() method to provide a custom, neatly formatted summary of a student when iterating through lists.

## Running the Console Application
You can run this project using your favorite Integrated Development Environment (IDE) or directly from the command line.

### Prerequisites
Java Development Kit (JDK): Make sure you have JDK 8 or higher installed on your system.

### 1. Clone the repository(or download the .zip and extract it):
```bash
git clone https://github.com/nivethapandian/StudentGradeTracker_JavaOOP.git
cd StudentGradeTracker_JavaOOP\student_grade_tracker
```

### Option 1: Using an IDE (Recommended)
**For Eclipse:**
1. Open Eclipse and go to File > Open Projects from File System, select the cloned folder, and click Finish
2. Click play button or Right-click anywhere inside the code editor, select Run As, and click Java Application.


### Option 2: Using the Command Line
If you prefer the terminal, follow these steps:
**1. Navigate to your file: Open your terminal or command prompt and use the cd command to go to the folder where you saved the file.**
  ```bash
  cd path/to/your/folder
  ```

**2. Compile the Java file:**
  ```bash
  javac GradeTracker.java
  ```

**3. Run the compiled program:**
  ```bash
  java GradeTracker
  ```

## Usage
When you run the application, you will be greeted with a looping menu:
```text
=========================================
   Student Grade Tracker  v1.0
=========================================

  1.  Add student
  2.  Add grade
  3.  View student report
  4.  View all students
  5.  Exit

Enter choice:
```

*Simply type the number corresponding to the action you want to take and hit Enter.*
