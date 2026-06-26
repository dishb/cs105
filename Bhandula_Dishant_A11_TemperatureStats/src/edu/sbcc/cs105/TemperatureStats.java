package edu.sbcc.cs105;

import java.util.ArrayList;

/**
 * Computes simple temperature statistics for a sequence of Celsius values.
 */
public class TemperatureStats {
    private final ArrayList<Double> temperatures;

    /**
     * Creates a new TemperatureStats instance with no temperatures.
     */
    public TemperatureStats() {
        this.temperatures = new ArrayList<>();
    }

    /**
     * Adds a temperature value in Celsius to the statistics.
     *
     * @param t the temperature value to add
     */
    public void addTemperature(double t) {
        temperatures.add(t);
    }

    /**
     * Clears all temperatures previously added to this object.
     */
    public void clearTemperatures() {
        temperatures.clear();
    }

    /**
     * Returns the maximum temperature among the values that have been added.
     *
     * @return the maximum temperature
     */
    public double getMaximumTemperature() {
        double max = temperatures.get(0);
        for (double temp : temperatures) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    /**
     * Returns the minimum temperature among the values that have been added.
     *
     * @return the minimum temperature
     */
    public double getMinimumTemperature() {
        double min = temperatures.get(0);
        for (double temp : temperatures) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    /**
     * Returns the average of all temperatures that have been added.
     *
     * @return the average temperature
     */
    public double getAverageTemperature() {
        double sum = 0.0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.size();
    }
}
