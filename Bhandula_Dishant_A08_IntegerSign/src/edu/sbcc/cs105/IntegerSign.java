package edu.sbcc.cs105;

public class IntegerSign {
    private int n;

    public IntegerSign(int numberToStore) {
        this.n = numberToStore;
    }

    public boolean isZero() {
        return this.n == 0;
    }

    public boolean isPositive() {
        return this.n > 0;
    }
}
