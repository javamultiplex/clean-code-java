package com.javamultiplex.testing.principles.example2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Rohit Agarwal on 05/09/20 7:36 pm
 * @copyright www.javamultiplex.com
 */
public class FileService {

    /**
     * @param directory
     * @param fileName
     * @param bytes
     * @return
     * @throws IOException
     */
    public Path write(final String directory, final String fileName, final byte[] bytes) throws IOException {
        Path path = Paths.get(directory);
        if (!Files.exists(path)) {
            createDirectory(directory);
        }
        return Files.write(Paths.get(directory + fileName), bytes);
    }

    /**
     * @param directory
     * @return
     * @throws IOException
     */
    public List<Path> list(final String directory) throws IOException {
        try (Stream<Path> stream = Files
                .list(Paths.get(directory))) {
            return stream
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());
        }

    }


    /**
     * @param directory
     * @throws IOException
     */
    public void createDirectory(String directory) throws IOException {
        Files.createDirectories(Paths.get(directory));
    }


    /**
     * @param directory
     * @throws IOException
     */
    public void cleanDirectory(String directory) throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get(directory))) {
            stream
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
        }
    }

}