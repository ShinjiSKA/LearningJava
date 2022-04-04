public class StudentProfileChallenge {
    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double studentGPA;
    String declaredMajor;

    public StudentProfileChallenge(String firstName, String lastName, int expectedYearToGraduate, double studentGPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.studentGPA = studentGPA;
        this.declaredMajor = declaredMajor;
    }

    public void incrementExpectedGraduationYear(){

        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }

}
