package com.javamultiplex.principle.kiss;

import java.util.stream.IntStream;

/**
 * @author Rohit Agarwal on 20/08/20 8:52 pm
 * @copyright www.javamultiplex.com
 */

//Find sum of first n natural numbers
public class Example1 {

    public int sum1(final int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int sum2(final int n) {
        return IntStream.range(1, n + 1).sum();
    }

    public int sum3(final int n) {
        return n * (n + 1) / 2;
    }

}
