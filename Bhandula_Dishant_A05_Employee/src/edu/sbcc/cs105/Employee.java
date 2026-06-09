package edu.sbcc.cs105;

/**
 * This class implements an employee which is a person with a name and a salary.
 *
 */
public class Employee {
    
    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */

     // TODO create instance variables if needed  
     private String name;
     private double salary;      

    public Employee(String employeeName, double currentSalary) {
                // TODO write constructor code
                name = employeeName;
                salary = currentSalary;
    }

    // Accessors that are obvious and have no side effects don't have to have
    // any documentation unless you are creating a library to be used by other
    // people.
    public String getName() {
         // TODO implement
         return name;
    }

    public double getSalary() {
           // TODO implement
           return salary;
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    public void raiseSalary(double byPercent) {
            // TODO implement
            salary += byPercent / 100 * salary;
    }
}