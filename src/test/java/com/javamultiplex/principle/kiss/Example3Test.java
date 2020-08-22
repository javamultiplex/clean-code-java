package com.javamultiplex.principle.kiss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 22/08/20 2:16 pm
 * @copyright www.javamultiplex.com
 */
public class Example3Test {

    private Example3 example3;

    @BeforeEach
    void setUp() {
        example3=new Example3();
    }

    @Test
    public void shouldReturnTrueForMethod1(){
        boolean result = example3.isNumber1("1234");
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForMethod1(){
        boolean result = example3.isNumber1("1acf4");
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForMethod2(){
        boolean result = example3.isNumber2("1234");
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForMethod2(){
        boolean result = example3.isNumber2("1acf4");
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForMethod3(){
        boolean result = example3.isNumber3("1234");
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForMethod3(){
        boolean result = example3.isNumber3("1acf4");
        Assertions.assertFalse(result);
    }
}
