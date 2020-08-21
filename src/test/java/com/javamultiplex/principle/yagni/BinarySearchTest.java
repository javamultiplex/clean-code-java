package com.javamultiplex.principle.yagni;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 20/08/20 11:19 pm
 * @copyright www.javamultiplex.com
 */
public class BinarySearchTest {

    @Test
    public void shouldSearchWithBubbleSortImplementation() {
        SortAlgorithm sortAlgorithm = new BubbleSort();
        BinarySearch binarySearch = new BinarySearch(sortAlgorithm);
        int index = binarySearch.search(new int[]{1, 8, 3, 4, 9}, 8);
        Assertions.assertEquals(-1, index);
    }
}
