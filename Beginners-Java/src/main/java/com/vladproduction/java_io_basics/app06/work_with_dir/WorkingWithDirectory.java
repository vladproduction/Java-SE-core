package com.vladproduction.java_io_basics.app06.work_with_dir;

import java.io.File;

public class WorkingWithDirectory {
    public static void main(String[] args) {

        File dir = new File("src/main/java/com/vladproduction/java_io_basics/app06/work_with_dir");
        checkFilesInDirectory(dir);
    }

    private static void checkFilesInDirectory(File dir) {

        File[] filesList = dir.listFiles();

        if (filesList != null) {
            for (File file : filesList) {
                System.out.println(file.getName());
            }
        }
    }
}
