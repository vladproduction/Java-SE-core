package com.app.vp.chapter_6_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The copy method copies elements from a source list into a destination list.
 * The destination list must be capable of holding the elements from the source list.
 * We express this by means of bounded wildcards: the output list is required to have an element type with a lower bound T
 * and the input list must have an element type with an upper bound T.
 * */
public class Tester5_copy {
    public static void main(String[] args) {

        List<Object> dest = new ArrayList<>();
        List<String> src = new ArrayList<>();
        src.add("A");
        src.add("B");
        src.add("C");
        //testing copy:
        copy(dest, src);
        int sizeDest = dest.size();
        System.out.println("sizeDest = " + sizeDest);

    }

    public static <T> void copy (List<? super T> dest, List<? extends T> src) {  // bounded wildcard parameterized types
        //Check destination list size: Before copying elements, add a check to see if the destination list can hold all
        // the elements from the source list. You can use dest.size() < src.size().
        if(dest.size() < src.size()){
            //Resize destination list (optional): If the destination list is smaller, you can resize it to accommodate
            // the source list elements using dest.addAll(Collections.nCopies(src.size() - dest.size(), null)).
            // This adds null elements to dest until its size matches src.
            dest.addAll(Collections.nCopies(src.size() - dest.size(), null));
        }
        for (int i=0; i<src.size(); i++){
            dest.set(i,src.get(i));
        }
    }
}
