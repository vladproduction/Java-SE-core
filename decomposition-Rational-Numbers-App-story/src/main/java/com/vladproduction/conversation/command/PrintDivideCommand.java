package com.vladproduction.conversation.command;

import com.vladproduction.rational.RationalNumber;

public class PrintDivideCommand extends Command{

    private final RationalNumber first;
    private final RationalNumber second;

    public PrintDivideCommand(String tag, RationalNumber first, RationalNumber second) {
        super(tag);
        this.first = first;
        this.second = second;
    }

    @Override
    public void execute() {
        System.out.println("Divide: " + first.divide(second));
    }
}
