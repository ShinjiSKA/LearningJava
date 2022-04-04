import java.util.Scanner;

public class MainStudentProfile {


    public static void main(String[] args){

        StudentProfileChallenge studentA = new StudentProfileChallenge("Thiago", "Sakata", 2024, 3.75, "Computer Science");
        StudentProfileChallenge studentB = new StudentProfileChallenge("Kethully", "Sakata", 2022, 5, "Architecture");

        System.out.println("Do you want to increment graduation year? Yes or No");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("Yes")){
            System.out.println("Student A or Student B?");
            Scanner scannerStudent = new Scanner(System.in);
            String inputStudent = scannerStudent.next();
            if (inputStudent.equals("A")) {
                studentA.incrementExpectedGraduationYear();
                System.out.println("Student Profile A");
                System.out.println("First Name: " + studentA.firstName);
                System.out.println("Last Name: " + studentA.lastName);
                System.out.println("Expected Year to Graduate: " + studentA.expectedYearToGraduate);
                System.out.println("Student GPA: " + studentA.studentGPA);
                System.out.println("Declared Major: " + studentA.declaredMajor);
                System.out.println("");
                System.out.println("Student Profile B");
                System.out.println("First Name: " + studentB.firstName);
                System.out.println("Last Name: " + studentB.lastName);
                System.out.println("Expected Year to Graduate: " + studentB.expectedYearToGraduate);
                System.out.println("Student GPA: " + studentB.studentGPA);
                System.out.println("Declared Major: " + studentB.declaredMajor);
            } else if (inputStudent.equals("B")){
                studentB.incrementExpectedGraduationYear();
                System.out.println("Student Profile A");
                System.out.println("First Name: " + studentA.firstName);
                System.out.println("Last Name: " + studentA.lastName);
                System.out.println("Expected Year to Graduate: " + studentA.expectedYearToGraduate);
                System.out.println("Student GPA: " + studentA.studentGPA);
                System.out.println("Declared Major: " + studentA.declaredMajor);
                System.out.println("");
                System.out.println("Student Profile B");
                System.out.println("First Name: " + studentB.firstName);
                System.out.println("Last Name: " + studentB.lastName);
                System.out.println("Expected Year to Graduate: " + studentB.expectedYearToGraduate);
                System.out.println("Student GPA: " + studentB.studentGPA);
                System.out.println("Declared Major: " + studentB.declaredMajor);
            } else {
                System.out.println("Invalid Command!");
                return;
            }
        } else {

            System.out.println("Student Profile A");
            System.out.println("First Name: " + studentA.firstName);
            System.out.println("Last Name: " + studentA.lastName);
            System.out.println("Expected Year to Graduate: " + studentA.expectedYearToGraduate);
            System.out.println("Student GPA: " + studentA.studentGPA);
            System.out.println("Declared Major: " + studentA.declaredMajor);
            System.out.println("");
            System.out.println("Student Profile B");
            System.out.println("First Name: " + studentB.firstName);
            System.out.println("Last Name: " + studentB.lastName);
            System.out.println("Expected Year to Graduate: " + studentB.expectedYearToGraduate);
            System.out.println("Student GPA: " + studentB.studentGPA);
            System.out.println("Declared Major: " + studentB.declaredMajor);
        }

    }
}
