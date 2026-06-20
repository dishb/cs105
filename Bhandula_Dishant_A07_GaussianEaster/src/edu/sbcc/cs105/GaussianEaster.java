package edu.sbcc.cs105;

/**
 * This class computes the month and day of Easter given the year. The only
 * instance variables allowed are m (the month) and d (the day).
 *
 */
public class GaussianEaster {
    private int m;
    private int d;

    public GaussianEaster(int Y) {
        float A, B, C, P, Q;
        double M, N, D, E;

        A = Y % 19;
        B = Y % 4;
        C = Y % 7;
        P = (float) Math.floor(Y / 100);
        Q = (float) Math.floor((13 + 8 * P) / 25);
        M = (15 - Q + P - Math.floor(P / 4)) % 30;
        N = (4 + P - Math.floor(P / 4)) % 7;
        D = (19 * A + M) % 30;
        E = (N + 2 * B + 4 * C + 6 * D) % 7;
        int days = (int) (22 + D + E);
        if ((D == 29) && (E == 6)) {
            m = 4;
            d = 19;
        } else if ((D == 28) && (E == 6)) {
            m = 4;
            d = 18;
        } else {
            if (days > 31) {
                d = days - 31;
                m = 4;
            } else {
                d = days;
                m = 3;
            }
        }
    }

    public int getM() {
        return m;
    }

    public int getD() {
        return d;
    }
}
