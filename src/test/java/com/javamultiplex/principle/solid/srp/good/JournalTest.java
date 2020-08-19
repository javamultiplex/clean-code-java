package com.javamultiplex.principle.solid.srp.good;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 16/08/20 3:23 pm
 * @copyright www.javamultiplex.com
 */
public class JournalTest {

    private Journal journal;

    @BeforeEach
    void setUp() {
        journal = new Journal();
    }

    @Test
    public void shouldAddEntry() {
        journal.addEntry("Learn Clean Code");
        journal.addEntry("Learn to play Guitar");
        String expected = "Learn Clean Code\n" +
                "Learn to play Guitar";
        assertEquals(expected, journal.toString());
    }

    @Test
    public void shouldAddEntries() {
        List<String> entries = List.of("Learn Clean Code", "Learn to play Guitar");
        journal.addEntries(entries);
        String expected = "Learn Clean Code\n" +
                "Learn to play Guitar";
        assertEquals(expected, journal.toString());
    }

    @Test
    public void shouldRemoveEntry() {
        journal.addEntry("Learn Clean Code");
        journal.addEntry("Learn to play Guitar");
        String expected = "Learn Clean Code\n" +
                "Learn to play Guitar";
        assertEquals(expected, journal.toString());
        journal.removeEntry("Learn Clean Code");
        assertEquals("Learn to play Guitar", journal.toString());
    }
}
