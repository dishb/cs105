package edu.sbcc.cs105;

public class Program {
    public static void main(String[] args) {
        Grade testGrade1 = new Grade("A");
        Grade testGrade2 = new Grade("B");
        Grade testGrade3 = new Grade("C");

        System.out.println("For grade A, we get " + testGrade1.getNumericGrade() + " and it should be 4.0.");
        System.out.println("For grade B, we get " + testGrade2.getNumericGrade() + " and it should be 3.0.");
        System.out.println("For grade C, we get " + testGrade3.getNumericGrade() + " and it should be 2.0.");
    }
}

/*
Output:

For grade A, we get 4.0 and it should be 4.0.
For grade B, we get 3.0 and it should be 3.0.
For grade C, we get 2.0 and it should be 2.0.
*/
