package com.javamultiplex.testing.principles.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Rohit Agarwal on 05/09/20 7:55 pm
 * @copyright www.javamultiplex.com
 */
public class FileServiceTestV2 {

    private FileService fileService;

    @BeforeEach
    void setUp() {
        fileService = new FileService();
    }

    @Test
    public void shouldWriteToFile() throws IOException {
        String text = "I love my india";
        Path path1 = fileService.write("src/test/resources/dummy1/", "file1.txt", text.getBytes());
        Assertions.assertEquals(Paths.get("file1.txt"), path1.getFileName());

        Path path2 = fileService.write("src/test/resources/dummy1/", "file2.txt", text.getBytes());
        Assertions.assertEquals(Paths.get("file2.txt"), path2.getFileName());

        Path path3 = fileService.write("src/test/resources/dummy1/", "file3.txt", text.getBytes());
        Assertions.assertEquals(Paths.get("file3.txt"), path3.getFileName());

        Path path4 = fileService.write("src/test/resources/dummy1/another/", "file4.txt", text.getBytes());
        Assertions.assertEquals(Paths.get("file4.txt"), path4.getFileName());
        fileService.cleanDirectory("src/test/resources/dummy1/");
    }

    @Test
    public void shouldListAllFilesInDirectory() throws IOException {
        String text = "I love my india";
        fileService.write("src/test/resources/dummy2/", "file1.txt", text.getBytes());
        fileService.write("src/test/resources/dummy2/", "file2.txt", text.getBytes());
        List<Path> list1 = fileService.list("src/test/resources/dummy2/");
        Assertions.assertEquals(2, list1.size());
        fileService.cleanDirectory("src/test/resources/dummy2/");
    }
}
