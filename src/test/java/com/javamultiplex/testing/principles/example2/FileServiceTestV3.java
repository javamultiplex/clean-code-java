package com.javamultiplex.testing.principles.example2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Rohit Agarwal on 05/09/20 7:55 pm
 * @copyright www.javamultiplex.com
 */
public class FileServiceTestV3 {

    private static final String DIRECTORY = "src/test/resources/dummy/";
    private FileService fileService;

    @BeforeEach
    void setUp() {
        fileService = new FileService();
    }

    @Test
    public void shouldWriteToFile() throws IOException {
        String text = "I love my india";
        Path path1 = fileService.write(DIRECTORY + "first/", "file1.txt", text.getBytes());
        Assertions.assertEquals(Paths.get("file1.txt"), path1.getFileName());

        Path path2 = fileService.write(DIRECTORY + "first/", "file2.txt", text.getBytes());
        Assertions.assertEquals(Paths.get("file2.txt"), path2.getFileName());

        Path path3 = fileService.write(DIRECTORY + "first/", "file3.txt", text.getBytes());
        Assertions.assertEquals(Paths.get("file3.txt"), path3.getFileName());

        Path path4 = fileService.write(DIRECTORY + "another/", "file4.txt", text.getBytes());
        Assertions.assertEquals(Paths.get("file4.txt"), path4.getFileName());
    }

    @Test
    public void shouldListAllFilesInDirectory() throws IOException {
        String text = "I love my india";
        fileService.write(DIRECTORY + "second/", "file1.txt", text.getBytes());
        fileService.write(DIRECTORY + "second/", "file2.txt", text.getBytes());
        List<Path> list1 = fileService.list(DIRECTORY+"second/");
        Assertions.assertEquals(2, list1.size());
    }

    @AfterAll
    static void tearDown() throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get(DIRECTORY))) {
            stream
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
        }
    }
}
