package edu.sbcc.cs105;

public class NumbersLoop {
    // Instance variables for the lower and upper bounds.
    private int lowerLimit;
    private int upperLimit;

    /**
     * Set the lower limit for the summation range.
     *
     * @param l the lower limit value
     */
    public void setLowerLimit(int l) {
        this.lowerLimit = l;
    }

    /**
     * Set the upper limit for the summation range.
     *
     * @param u the upper limit value
     */
    public void setUpperLimit(int u) {
        this.upperLimit = u;
    }

    /**
     * Add all numbers from lowerLimit through upperLimit, inclusive.
     *
     * @return the sum of the inclusive range
     */
    public int addLowerAllTheWayToUpper() {
        int sum = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            sum += i;
        }

        return sum;
    }
}
