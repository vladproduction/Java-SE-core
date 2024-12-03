package com.vladproduction.fileNotFoundException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ContentReader {

    public String readerFile(File f) throws FileNotFoundException {
        FileInputStream in = new FileInputStream(f);

        return "text";
    }
}
