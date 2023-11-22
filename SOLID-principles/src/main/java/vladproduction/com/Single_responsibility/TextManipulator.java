package vladproduction.com.Single_responsibility;

public class TextManipulator {
    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }
    
    public void findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
    }
    
    public void findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
    }

    public void printText() {
        TextManipulator textManipulator = new TextManipulator(getText());
        System.out.println(textManipulator.getText());
    }
}