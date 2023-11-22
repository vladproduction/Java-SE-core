package vladproduction.com.Single_responsibility;

public class Main {
    public static void main(String[] args) {
        TextManipulator tm = new TextManipulator("Testing text by TextManipulator");
        tm.printText();
        tm.appendText(" + append new text");
        tm.printText();
        tm.findWordAndReplace("text", "replaced");
        tm.printText();
        tm.findWordAndDelete("replaced");
        tm.printText();
        System.out.println("-----------------------");
        TextPrinter tp = new TextPrinter(tm);
        tp.printText();
        tp.printOutEachWordOfText();

        tp.printRangeOfCharacters(0, 11);

    }
}
