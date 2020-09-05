package com.javamultiplex.testing.principles.example3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

/**
 * @author Rohit Agarwal on 05/09/20 11:32 pm
 * @copyright www.javamultiplex.com
 */
public class DateTimeServiceV2Test {

    private DateTimeServiceV2 dateTimeService;

    @BeforeEach
    void setUp() {
        dateTimeService = new DateTimeServiceV2();
    }

    @Test
    public void shouldThrowIllegalArgumentException_LocalDateIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> dateTimeService.getWeekDay(null));
    }

    @Test
    public void shouldGetDayOfWeek() {
        LocalDate localDate = LocalDate.of(2020, 6, 11);
        String weekDay = dateTimeService.getWeekDay(localDate);
        Assertions.assertEquals("Thursday", weekDay);
    }
}
