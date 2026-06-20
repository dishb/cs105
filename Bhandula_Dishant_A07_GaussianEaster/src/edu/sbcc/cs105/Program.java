package edu.sbcc.cs105;

import java.util.Scanner;

/**
 * This class tests the GaussianEaster object.
 *
 */
public class Program {
    /**
     * Test this code by asking for a year and then having the GaussianEaster class compute the value.
     * 
     * @param args command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input Easter year: ");
        int y = s.nextInt();
        GaussianEaster testCase = new GaussianEaster(y);
        System.out.println("Year: " + y +  " Month: " + testCase.getM() + " Day: " + testCase.getD());
        s.close();
    }
}

/*
Output:

Input Easter year: 
2001
Year: 2001 Month: 4 Day: 15
*/
