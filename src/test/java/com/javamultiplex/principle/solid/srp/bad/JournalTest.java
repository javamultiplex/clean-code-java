package com.javamultiplex.principle.solid.srp.bad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
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
        List<String> entries = Arrays.asList("Learn Clean Code", "Learn to play Guitar");
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

    @Test
    public void shouldSaveEntryToFile() throws IOException {
        journal.save("journal.text", "Learn to Code");
    }

    @Test
    public void shouldSaveEntriesToFile() throws IOException {
        journal.save("journal.text", Arrays.asList("Learn to Code", "Learn Guitar"));
    }

    @Test
    public void shouldLoadEntries() throws IOException {
        List<String> list = journal.load("journal.text");
        System.out.println(list);
    }
}
