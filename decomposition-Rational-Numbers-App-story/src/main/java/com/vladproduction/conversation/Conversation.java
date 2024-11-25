package com.vladproduction.conversation;

import com.vladproduction.conversation.command.Command;

import java.util.Scanner;
import java.util.StringJoiner;

public class Conversation {

    private final Command[] commands;

    public Conversation(final Command... commands) {
        this.commands = commands;
    }

    public void run(){

        printGreeting();

        final Scanner scanner = new Scanner(System.in);
        conversation:
        while (true) {
            final String input = scanner.next();
            for (Command command : commands) {
                if (command.hasTag(input)) {
                    command.execute();
                    break conversation;
                }
            }
            printRetryMessage();
        }

    }

    private void printRetryMessage() {
        System.out.println("Cannot recognize the command. Please, enter one of the following:");
        for (Command command : commands) {
            System.out.println(command.getTag());
        }
    }

    private void printGreeting() {
        StringJoiner commandTagsJoiner = new StringJoiner("/");
        for (Command command : commands) {
            commandTagsJoiner.add(command.getTag());
        }
        System.out.printf("What operation to perform (%s)?", commandTagsJoiner);
        System.out.println();
    }
}
