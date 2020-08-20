package com.javamultiplex.principle.kiss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 20/08/20 9:00 pm
 * @copyright www.javamultiplex.com
 */

//Read file and store in list
public class Example2 {

    public List<String> read1(final File file) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        }
        return lines;
    }

    public List<String> read2(final File file) throws IOException {
        return Files.readAllLines(file.toPath());
    }

}
