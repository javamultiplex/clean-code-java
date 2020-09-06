package com.javamultiplex.testing.principles.example4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 06/09/20 10:00 pm
 * @copyright www.javamultiplex.com
 */
public class DivisionTest {


    @Test
    public void shouldCreateDivisionObject() {
        Division division = new Division(10, 3);
        Assertions.assertNotNull(division);
        Assertions.assertEquals(10, division.getQuotient());
        Assertions.assertEquals(3, division.getRemainder());
    }
}
