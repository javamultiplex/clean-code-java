package com.javamultiplex.testing.principles.example3;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Rohit Agarwal on 05/09/20 11:27 pm
 * @copyright www.javamultiplex.com
 */
public class DateTimeService {

    public String getWeekDay() {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        int weekDay = dayOfWeek.getValue();
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return weekdays[weekDay-1];
    }

}
