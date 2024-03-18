package com.vladproduction.vp40_exceptions_cases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main40 {

    public static void main(String[] args) {
        //multi catch and more than one catch bloc
        try {
            run();
        } catch (IOException | ParseException e) { //multi catch
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

        //handling as one for all
        try {
            run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //but what if we have catch bloc after we catch Exception:
        //not right because we have already caught ParseException (it extends from Exception)
//        try {
//            run();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } catch (ParseException e){
//
//        }

    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
