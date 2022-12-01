package org.example;

import java.time.Instant;
import java.util.ArrayList;

/**
 *
 * Class for testing the main methods of ArrayList
 */
public class ArrayListTest implements TimeTesting {
    /**
     * variable for time counting
     */
    protected Instant time;
    /**
     * dimension of ArrayList
     */
    protected int n;
    ArrayList<Integer> list;

    /**
     * constructor
     * @param n dimension of ArrayList
     */
    ArrayListTest(int n) {
        this.n = n;
        list = new ArrayList<>();
    }

    /**
     * adding an element
     * @return execution time
     */
    public long add() {
        time = Instant.now();
        for (int i = 0; i < n; i++)
            list.add(i);
        return Instant.now().getNano()-time.getNano();
    }

    /**
     * remove an element
     * @return execution time
     */
    public long remove() {
        if (list.isEmpty()) add();
        time = Instant.now();
        for (int i = 0; i < n; i++)
            list.remove(0);
        return Instant.now().getNano()-time.getNano();
    }

    /**
     * getting elements of ArrayList
     * @return execution time
     */
    public long get() {
        if (list.isEmpty()) add();
        time = Instant.now();
        int num;
        for (int i = 0; i < n; i++)
            num = list.get(0);
        return Instant.now().getNano()-time.getNano();
    }
}
