package com.javamultiplex.principle.yagni;

/**
 * @author Rohit Agarwal on 20/08/20 11:14 pm
 * @copyright www.javamultiplex.com
 */
public class BinarySearch {

    private final SortAlgorithm sortAlgorithm;

    public BinarySearch(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int search(int[] numbers, int numberToSearch) {
        int[] sortedArray = sortAlgorithm.sort(numbers);
        //TODO: Binary Search Implementation
        return -1;
    }
}
