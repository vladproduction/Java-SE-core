package com.vladproduction.custom_exception;

/**
 * The example describes the Student class, which has setters for setting fields.
 * The mark field has a range of values, so the setMark() method, which is used to set the student's grade,
 * first checks the value that came in. If it goes outside the range, an error occurs.
 * This is not a system error, but a logical one. To handle it in the same way as system errors,
 * a custom exception MarkException is described as an Exception successor. After this error, the program can be resumed,
 * so the exception belongs to the checked exception category. Since the setMark() method does not have
 * information on how to handle the exception, it is passed to the code that calls it.
 * The setMark() method is called in the main() method. According to the rules for handling checked exceptions,
 * its call is monitored for an exception and handled; in this case, by displaying information to the user about
 * the situation that has arisen.
 * */
public class Main {
    public static void main(String[] args) {
        Student stud = new Student("John", 505);
        try {
            stud.setMark(101);
        } catch (MarkException ee) {
            System.err.println( ee.getMessage() );
        }
    }
}
