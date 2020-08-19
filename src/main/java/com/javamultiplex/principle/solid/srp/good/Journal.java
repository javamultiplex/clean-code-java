package com.javamultiplex.principle.solid.srp.good;

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

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
