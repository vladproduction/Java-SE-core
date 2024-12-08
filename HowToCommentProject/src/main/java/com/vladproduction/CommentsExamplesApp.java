package com.vladproduction;

public class CommentsExamplesApp {
    public static void main(String[] args) {

        // This is a comment
        System.out.println("Hello World");
        System.out.println("Hello World"); // This is a comment

        /*  The code below will print the words
            Hello World to the screen   */
        System.out.println("Hello World");

        /*If the comments contain links to other files, such as images (diagrams, pictures, or screenshots of UI components),
        you must place these files in a directory called doc-files. The javadoc utility will copy this directory, its subdirectories,
        and the files it contains from the source directory to the documentation directory. For example:
        <img src="doc-files/uml.png" alt="Diagram UML"/>*/




    }

    /**
     * Restore the parameter to the appropriate index. An index
     * ranges from <code>0</code> to <code>length() - 1</code>.
     *
     * @param index the index of the desired character.
     * @return the desired character.
     * @throws IllegalArgumentException
     * if the index is not in the range <code>0</code>
     * to <code>length()-1</code>.
     * @see java.lang.Character#charValue()
     */
    public char charAt(int index) throws IllegalArgumentException{
        char result = 'a';
        //... code
        return result;
    }
}
