package com.javamultiplex.testing.principles.example3;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Rohit Agarwal on 05/09/20 11:27 pm
 * @copyright www.javamultiplex.com
 */
public class DateTimeServiceV2 {

    public String getWeekDay(LocalDate localDate) {
        if (localDate == null) {
            throw new IllegalArgumentException("LocalDate is null.");
        }
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int weekDay = dayOfWeek.getValue();
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return weekdays[weekDay - 1];
    }

}
