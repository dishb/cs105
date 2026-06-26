package edu.sbcc.cs105;

public class Program {
    public static void main(String[] args) {
        Population city = new Population();
        city.setPopulation(9870);

        System.out.println("Current population: " + city.getPopulation());

        int years = city.getNumberOfYearsToReachThisPopulation(10, 30000);
        System.out.println("Years to reach 30000 at 10% growth: " + years);
    }
}

/*
Output:

Current population: 9870
Years to reach 30000 at 10% growth: 12
*/
