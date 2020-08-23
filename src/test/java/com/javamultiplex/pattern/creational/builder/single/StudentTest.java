package com.javamultiplex.pattern.creational.builder.single;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 23/08/20 7:53 pm
 * @copyright www.javamultiplex.com
 */
public class StudentTest {

    @Test
    public void shouldCreateStudentObject() {
        Student.StudentBuilder studentBuilder =
                new Student.StudentBuilder("Rohit", "Agarwal", "B.Tech");
        Student student = studentBuilder
                .withAadhar(1234)
                .withCity("Rudrapur")
                .withHobby("Coding")
                .build();
        assertEquals("Coding", student.getHobby());
        assertEquals("Rohit", student.getFirstName());
        assertEquals("Agarwal", student.getLastName());
        assertEquals("B.Tech", student.getDegree());
        assertEquals("Rudrapur", student.getCity());
        assertEquals(1234, student.getAadharId());
    }
}
