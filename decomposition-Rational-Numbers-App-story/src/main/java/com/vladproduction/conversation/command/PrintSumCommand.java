package com.vladproduction.conversation.command;

import com.vladproduction.rational.RationalNumber;

public class PrintSumCommand extends Command{

    private final RationalNumber first;
    private final RationalNumber second;

    public PrintSumCommand(String tag, RationalNumber first, RationalNumber second) {
        super(tag);
        this.first = first;
        this.second = second;
    }

    @Override
    public void execute() {
        System.out.println("Sum: " + first.add(second));
    }
}
