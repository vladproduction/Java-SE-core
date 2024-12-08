package com.vladproduction.methods;

import java.util.Optional;

public class MainBaseMethods {
    public static void main(String[] args) {

        // isPresent()
        Optional<String> name = Optional.of("John");
        if (name.isPresent()) {
            System.out.println(name.get()); //John
        }

        // ifPresent() - functional style
        name.ifPresent(System.out::println); //John

        //orElse()
        Optional<String> name2 = Optional.empty();
        System.out.println(name2.orElse("Blank"));//Blank

        //orElseGet()
        Optional<String> name3 = Optional.of("John");
        System.out.println(name3.orElseGet(String::new));//John

        //orElseThrow()
        Optional<String> empty = Optional.empty();
        Object emptyValue = empty.orElseThrow(); //NoSuchElementException: No value present

    }
}
