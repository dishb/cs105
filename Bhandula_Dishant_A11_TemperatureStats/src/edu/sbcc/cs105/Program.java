package edu.sbcc.cs105;

/**
 * Demonstrates the TemperatureStats class by adding temperatures and
 * printing expected and actual statistics.
 */
public class Program {
    /**
     * Entry point for the sample program.
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        TemperatureStats stats = new TemperatureStats();

        stats.addTemperature(12.5);
        stats.addTemperature(23.1);
        stats.addTemperature(-5.0);
        stats.addTemperature(18.4);
        stats.addTemperature(12.5);

        System.out.println("Added temperatures: 12.5, 23.1, -5.0, 18.4, 12.5");

        double max = stats.getMaximumTemperature();
        double min = stats.getMinimumTemperature();
        double avg = stats.getAverageTemperature();

        System.out.println("Expected maximum: 23.1");
        System.out.println("Actual maximum: " + max);
        System.out.println("Expected minimum: -5.0");
        System.out.println("Actual minimum: " + min);
        System.out.println("Expected average: 12.3");
        System.out.println("Actual average: " + avg);

        stats.clearTemperatures();
        System.out.println("Temperatures cleared.");
    }
}

/*
Output:

Added temperatures: 12.5, 23.1, -5.0, 18.4, 12.5
Expected maximum: 23.1
Actual maximum: 23.1
Expected minimum: -5.0
Actual minimum: -5.0
Expected average: 12.3
Actual average: 12.3
Temperatures cleared.
*/
