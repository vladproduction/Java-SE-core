package com.vladproduction.abstraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * base logic with interacts to file and retrieving with it`s contents;
 * */
public abstract class AbstractFileReader {

    private final Path filePath; //once it set it will not be changed for the instance

    protected AbstractFileReader(String filePath) {
        this.filePath = Path.of(filePath);
    }

    public String getPath() {
        return filePath.toString();
    }

    public List<String> readFile() throws IOException {
        return Files.lines(filePath)
                .map(this::parseLine)
                .collect(Collectors.toList());
    }

    protected abstract String parseLine(String line);
}
