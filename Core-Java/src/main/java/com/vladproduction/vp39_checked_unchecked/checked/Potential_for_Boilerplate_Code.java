package com.vladproduction.vp39_checked_unchecked.checked;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Potential_for_Boilerplate_Code {
    /////////////////Without Abstraction (Boilerplate Code)://///////////////
    /**public class ConfigurationService {

     public String readProperty(String filename, String propertyName) throws IOException {
     FileReader reader = new FileReader(filename);
     try {
     // Read configuration data
     // ...

     } finally {
     reader.close();
     }
     }

     public Integer readIntegerProperty(String filename, String propertyName) throws IOException {
     FileReader reader = new FileReader(filename);
     try {
     // Read configuration data
     // Convert to integer
     // ...

     } finally {
     reader.close();
     }
     }

     // ... similar methods for reading different data types ...
     }*/

    /////////////////Using Higher-Level Abstraction (Reduce Boilerplate)://///////////////
    /** 1)Create a Utility Class:

     public class FileUtil {

     public static String readFileContent(String filename) throws IOException {
     StringBuilder content = new StringBuilder();
     FileReader reader = new FileReader(filename);
     try (BufferedReader br = new BufferedReader(reader)) {
     String line;
     while ((line = br.readLine()) != null) {
     content.append(line).append("\n");
     }
     }
     return content.toString();
     }
     }

        2)Refactor Service Methods:

     public class ConfigurationService {

     public String readProperty(String filename, String propertyName) throws IOException {
     String content = FileUtil.readFileContent(filename);
     // Parse content to extract property value
     // ...
     }

     public Integer readIntegerProperty(String filename, String propertyName) throws IOException {
     String content = FileUtil.readFileContent(filename);
     // Parse content to extract and convert to integer
     // ...
     }

     // ... similar methods using FileUtil.readFileContent ...
     }*/
}
