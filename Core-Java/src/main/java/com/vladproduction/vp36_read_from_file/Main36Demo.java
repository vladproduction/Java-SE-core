package com.vladproduction.vp36_read_from_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vladproduction on 08-Mar-24
 */

public class Main36Demo {
    public static void main(String[] args) throws FileNotFoundException {

//        scannerInput_Read();
//        scannerRead_Test_DemoTxt();
//        scannerRead_Numbers_InlineTxt();
        simplePathToTheRootFile();

    }

    private static void simplePathToTheRootFile() throws FileNotFoundException {

        File file = new File("FileFor_vp36.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" "); //split our line by 'space'
        System.out.println("numbers(String) = " + Arrays.toString(numbers));
        int[] numbs = new int[5];
        int counter = 0;
        for (String number: numbers){
            int i = Integer.parseInt(number);
            numbs[counter++] = i;
        }

        System.out.println("numbs(int) = " + Arrays.toString(numbs));

        scanner.close();
    }

    private static void scannerRead_Numbers_InlineTxt() throws FileNotFoundException {

        String filePath = "src/main/java/com/vladproduction/vp36_read_from_file/demo/numbers_inline.txt";
        String separator = File.separator;
        String filePathSeparator = "src" + separator + "main" + separator +  "java" + separator + "com" + separator + "vladproduction"
                + separator + "vp36_read_from_file" + separator + "demo" + separator + "numbers_inline.txt";

        File file = new File(filePathSeparator);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" "); //split our line by 'space'
        System.out.println("numbers(String) = " + Arrays.toString(numbers));
        int[] numbs = new int[3];
        int counter = 0;
        for (String number: numbers){
            int i = Integer.parseInt(number);
            numbs[counter++] = i;
        }

        System.out.println("numbs(int) = " + Arrays.toString(numbs));

        scanner.close();
    }

    private static void scannerRead_Test_DemoTxt() throws FileNotFoundException {
        //create file first and save pathname:
        String filePath = "src/main/java/com/vladproduction/vp36_read_from_file/demo/test_demo.txt";
        String separator = File.separator;
        String filePathSeparator = "src" + separator + "main" + separator +  "java" + separator + "com" + separator + "vladproduction"
                + separator + "vp36_read_from_file" + separator + "demo" + separator + "test_demo.txt";

        File file = new File(filePathSeparator);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    private static void scannerInput_Read() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("string = " + string);
    }
}
