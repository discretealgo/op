EduSystem:

import Package.admission.StudentDetails;
import Package.admission.Library;
import Package.education.Assignment;
import Package.education.Examination;

import java.util.Scanner;

public class EduSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentDetails studentDetails=null;
        Library library=null;
        Assignment assignment =null;
        Examination examination=null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Student Details");
           
            System.out.println("2. Library Details");
           
            System.out.println("3. Assignment Details");
            
            System.out.println("4. Examination Details");
           
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentDetails = new StudentDetails();
                    studentDetails.inputStudentDetails();
                    studentDetails.displayStudentDetails();
                    break;
                case 2:
                    
                    library = new Library();
                    library.inputLibraryDetails();
                    library.displayLibraryDetails();
                    break;
                case 3:
                    assignment = new Assignment();
                    assignment.inputAssignmentDetails();
                    assignment.displayAssignmentDetails();
                    break;
                case 4:
                    examination = new Examination();
                    examination.inputExaminationDetails();
                    examination.displayExaminationDetails();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
    

Library.java:
Package\admission\Library.java


package Package.admission;


import java.util.Scanner;

public class Library {
    private String bookName;
    private String issueDate;
    private String returnDate;

    public void inputLibraryDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        bookName = scanner.nextLine();
        System.out.print("Enter Issue Date: ");
        issueDate = scanner.nextLine();
        System.out.print("Enter Return Date: ");
        returnDate = scanner.nextLine();
    }

    public void displayLibraryDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
    }
}


StudentDetail.java:
Package\admission\StudentDetails.java


package Package.admission;

import java.util.Scanner;

public class StudentDetails {
    private String studentName;
    private String department;
    private String dateOfBirth;

    public void inputStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();
        System.out.print("Enter Department: ");
        department = scanner.nextLine();
        System.out.print("Enter Date of Birth: ");
        dateOfBirth = scanner.nextLine();
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}


Package\education\Examination.java



package Package.education;

import java.util.Scanner;

public class Examination {
    private String subject;
    private double marks;

    public void inputExaminationDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Subject: ");
        subject = scanner.nextLine();
        System.out.print("Enter Marks: ");
        marks = scanner.nextDouble();
    }

    public void displayExaminationDetails() {
        System.out.println("Subject: " + subject);
        System.out.println("Marks: " + marks);
    }
}



Package\education\Assignment.java



package Package.education;


import java.util.Scanner;

public class Assignment {
    private int assignmentNo;
    private String subject;
    private double marksOnAssignment;

    public void inputAssignmentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Assignment Number: ");
        assignmentNo = scanner.nextInt();
        System.out.print("Enter Subject: ");
        subject = scanner.nextLine();
        System.out.print("Enter Marks on Assignment: ");
        marksOnAssignment = scanner.nextDouble();
    }

    public void displayAssignmentDetails() {
        System.out.println("Assignment No:");
        System.out.println("Subject: " + subject);
        System.out.println("Marks on Assignment: " + marksOnAssignment);
    }
}
