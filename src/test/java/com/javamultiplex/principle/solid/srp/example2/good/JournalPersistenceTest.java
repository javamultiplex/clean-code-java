package com.javamultiplex.principle.solid.srp.example2.good;

import com.javamultiplex.principle.solid.srp.example2.good.JournalPersistence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rohit Agarwal on 16/08/20 3:57 pm
 * @copyright www.javamultiplex.com
 */
public class JournalPersistenceTest {

    private JournalPersistence journalPersistence;

    @BeforeEach
    void setUp() {
        journalPersistence = new JournalPersistence();
    }

    @Test
    public void shouldSaveEntryToFile() throws IOException {
        journalPersistence.save("journal.text", "Learn to Code");
    }

    @Test
    public void shouldSaveEntriesToFile() throws IOException {
        journalPersistence.save("journal.text", Arrays.asList("Learn to Code", "Learn Guitar"));
    }

    @Test
    public void shouldLoadEntries() throws IOException {
        List<String> list = journalPersistence.load("journal.text");
        System.out.println(list);
    }
}
