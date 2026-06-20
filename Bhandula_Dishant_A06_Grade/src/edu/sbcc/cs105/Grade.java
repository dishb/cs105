package edu.sbcc.cs105;

public class Grade {
    private String grade;

    public Grade(String grade) {
        this.grade = grade;
    }

    public String getLetterGrade() {
        return this.grade;
    }

    public double getNumericGrade() {
        if (this.grade.equalsIgnoreCase("a")) {
            return 4.0;
        } else if (this.grade.equalsIgnoreCase("b")) {
            return 3.0;
        } else if (this.grade.equalsIgnoreCase("c")) {
            return 2.0;
        } else if (this.grade.equalsIgnoreCase("d")) {
            return 1.0;
        }

        return 0.0;
    }
}
