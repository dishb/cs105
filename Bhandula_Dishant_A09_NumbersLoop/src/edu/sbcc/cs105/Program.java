package edu.sbcc.cs105;

public class Program {
    public static void main(String[] args) {
        NumbersLoop numbers = new NumbersLoop();
        numbers.setLowerLimit(1);
        numbers.setUpperLimit(10);

        int result = numbers.addLowerAllTheWayToUpper();
        System.out.println("Sum from " + 1 + " to " + 10 + " = " + result);
    }
}

/*
Output:

Sum from 1 to 10 = 55
*/
