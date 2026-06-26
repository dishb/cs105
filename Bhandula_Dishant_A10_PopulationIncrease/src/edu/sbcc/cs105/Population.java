package edu.sbcc.cs105;

public class Population {
    /** The current population of the city. */
    private int population;

    /**
     * Sets the current population of the city.
     *
     * @param population the current population value to store
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * Returns the current population of the city.
     *
     * @return the current population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Calculates the number of years it takes for the population to reach the target population
     * given a fixed yearly percentage increase.
     *
     * @param increaseRate the annual population increase rate as a percentage (for example 10 means 10%)
     * @param targetPopulation the population target to reach
     * @return the number of years required to reach or exceed the target population
     */
    public int getNumberOfYearsToReachThisPopulation(int increaseRate, int targetPopulation) {
        int years = 0;
        int current = population;

        while (current < targetPopulation) {
            current += (current * increaseRate) / 100;
            years++;
        }

        return years;
    }
}
