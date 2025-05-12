package com.vladproduction.app21.check_prime_number;

import javax.swing.*;
import java.awt.*;

/**
 * A prime number must have exactly two positive divisors:
 * 👉 1 and itself.
 *  2 is the only even prime number — all other even numbers are divisible by 2 and hence not prime
 * */
public class AmountPrimeNumbersInRangeGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI(0, 200));
    }

    private static void createAndShowGUI(int from, int to) {

        JFrame frame = new JFrame("Amount of prime numbers in range");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(textArea);

        StringBuilder result = new StringBuilder();
        result.append("Prime numbers in range from ").append(from).append(" to ").append(to).append(":\n\n");

        int count = 0;
        for (int i = from; i <= to; i++) {
            if (checkPrime(i)) {
                result.append(i).append(" ");
                count++;
            }
        }
        result.append("\nTotal of prime numbers: ").append(count);
        textArea.setText(result.toString());

        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);

    }

    private static boolean checkPrime(int number){
        if(number <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
             if(number % i == 0){
                 return false;
             }
        }
        return true;
    }
}
