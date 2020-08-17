package com.javamultiplex.principle.solid.srp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @author Rohit Agarwal on 16/08/20 3:55 pm
 * @copyright www.javamultiplex.com
 */
public class JournalPersistence {

    public void save(String fileName, List<String> entries) throws IOException {
        for (String entry : entries) {
            save(fileName, entry);
        }
    }

    public void save(String fileName, String entry) throws IOException {
        File file = new File(fileName);
        Files.write(file.toPath(), entry.getBytes(), StandardOpenOption.APPEND);
    }

    public List<String> load(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }
}
