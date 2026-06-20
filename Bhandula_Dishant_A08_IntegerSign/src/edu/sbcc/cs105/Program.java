package edu.sbcc.cs105;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner consoleReader = new Scanner(System.in);
        int count = 1;
        while (count <= 3) {
            System.out.printf("Enter an integer: ");
            int n = consoleReader.nextInt();
            IntegerSign myIS = new IntegerSign(n);
            if (myIS.isZero()) {
                System.out.printf("%d is zero", n);
            } else if (myIS.isPositive()) {
                System.out.printf("%d is positive.", n);
            } else {
                System.out.printf("%d is negative", n);
            }
            System.out.println();
            count++;
        }
        consoleReader.close();
    }
}

/*
Output:

Enter an integer: -10
-10 is negative
Enter an integer: 0
0 is zero
Enter an integer: 10
10 is positive.
*/
