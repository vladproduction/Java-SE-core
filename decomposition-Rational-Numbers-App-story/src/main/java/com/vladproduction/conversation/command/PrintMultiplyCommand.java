package com.vladproduction.conversation.command;

import com.vladproduction.rational.RationalNumber;

public class PrintMultiplyCommand extends Command{

    private final RationalNumber first;
    private final RationalNumber second;

    public PrintMultiplyCommand(String tag, RationalNumber first, RationalNumber second) {
        super(tag);
        this.first = first;
        this.second = second;
    }

    @Override
    public void execute() {
        System.out.println("Multiply: " + first.multiply(second));
    }
}
