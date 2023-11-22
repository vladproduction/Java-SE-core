package vladproduction.com;

public class StaticFields {

    static int statF;
    int nonStatF;

    public StaticFields(int nonStatF1, int nonStatF2) {
        statF = nonStatF1;
        nonStatF = nonStatF2;

        String text = "New Object created\n";
        text += "Static field "+statF+"\n";
        text += "Non static field "+nonStatF;
        System.out.println(text);
    }

    void show(){
        String text = "New Object created\n";
        text += "Static field "+statF+"\n";
        text += "Non static field "+nonStatF;
        System.out.println(text);
    }


}
