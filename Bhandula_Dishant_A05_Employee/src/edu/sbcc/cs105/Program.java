package edu.sbcc.cs105;

public class Program {
    public static void main(String[] args) {
        Employee jane = new Employee("Jane Smith", 10000);
        String name = jane.getName();
        double janeSalary = jane.getSalary();
        System.out.println(name + "'s salary is $" + janeSalary);
        jane.raiseSalary(10); // Jane gets a 10% raise.
        janeSalary = jane.getSalary();
        System.out.println("After the raise, " + name + "'s salary is $" + janeSalary);
    }
}

/*
Output:

Jane Smith's salary is $10000.0
After the raise, Jane Smith's salary is $11000.0
*/
