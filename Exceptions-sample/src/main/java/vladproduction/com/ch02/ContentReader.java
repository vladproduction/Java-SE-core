package vladproduction.com.ch02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ContentReader {

    public String readerFile(File f) throws FileNotFoundException {
        FileInputStream in = new FileInputStream(f);

        return "text";
    }
}
