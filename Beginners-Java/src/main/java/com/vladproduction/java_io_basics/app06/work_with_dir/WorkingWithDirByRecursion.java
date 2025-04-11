package com.vladproduction.java_io_basics.app06.work_with_dir;

import java.io.File;

public class WorkingWithDirByRecursion {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/vladproduction/java_io_basics/app06");
        checkAllFilesInDirectory(file);


    }

    private static void checkAllFilesInDirectory(File dir) {
        System.out.println(dir);
        if (!dir.isDirectory()) {
            return;
        }
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                checkAllFilesInDirectory(file);
            }
        }

    }
}
