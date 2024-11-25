package com.vladproduction.rational;

import com.vladproduction.conversation.Conversation;
import com.vladproduction.conversation.command.PrintMultiplyCommand;
import com.vladproduction.conversation.command.PrintSumCommand;

public class RationalNumbers {
    public static void main(String[] args) {

        RationalNumber first = new RationalNumberInteractiveReader("first").read();
        RationalNumber second = new RationalNumberInteractiveReader("second").read();

        final Conversation conversation = new Conversation(
                new PrintSumCommand("SUM", first, second),
                new PrintMultiplyCommand("MULT", first, second),
                new PrintMultiplyCommand("DIV", first, second)
        );

        conversation.run();

    }

}
