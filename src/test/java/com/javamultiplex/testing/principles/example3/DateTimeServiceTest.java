package com.javamultiplex.testing.principles.example3;

import com.javamultiplex.testing.principles.example3.DateTimeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 05/09/20 11:32 pm
 * @copyright www.javamultiplex.com
 */
public class DateTimeServiceTest {

    private DateTimeService dateTimeService;

    @BeforeEach
    void setUp() {
        dateTimeService = new DateTimeService();
    }

    @Test
    public void shouldGetDayOfWeek() {
        String weekDay = dateTimeService.getWeekDay();
        Assertions.assertEquals("Saturday", weekDay);
    }
}
