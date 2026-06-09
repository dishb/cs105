package edu.sbcc.cs105;

public class Program {

    /**
     * This method creates a DieSimulator object and repeatedly invokes its
     * rollTheDie method. The hope is that there are enough calls here to show
     * that the simulator works properly.
     */
    public static void main(String[] args) {
        DieSimulator ds = new DieSimulator();

        System.out.println("1. One die roll is " + ds.rollTheDie());
        System.out.println("2. Another die roll is " + ds.rollTheDie());
        System.out.println("3. Another die roll is " + ds.rollTheDie());
        System.out.println("4. Another die roll is " + ds.rollTheDie());
        System.out.println("5. Another die roll is " + ds.rollTheDie());
    }
}

/*
Output:

1. One die roll is 6
2. Another die roll is 5
3. Another die roll is 1
4. Another die roll is 3
5. Another die roll is 2
*/
