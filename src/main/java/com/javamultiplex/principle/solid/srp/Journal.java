package com.javamultiplex.principle.solid.srp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 16/08/20 3:14 pm
 * @copyright www.javamultiplex.com
 */
public class Journal {
    private final List<String> entries;

    public Journal() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        entries.add(entry);
    }

    public void addEntries(List<String> entryList) {
        entries.addAll(entryList);
    }

    public void removeEntry(String entry) {
        entries.remove(entry);
    }

    //This method is breaking SRP principle, it should be part of JournalPersistence class
    public void save(String fileName) throws FileNotFoundException {
        try (PrintStream printStream = new PrintStream(new File(fileName))) {
            printStream.print(toString());
        }
    }

    //This method is breaking SRP principle, it should be part of JournalPersistence class
    public void load(String fileName) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                entries.add(line);
                line = bufferedReader.readLine();
            }
        }
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
