package com.vladproduction._06_real_world_apps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UISample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multithreading Example");
        JButton button = new JButton("Click ME!");

        //creating action for button (add ActionListener as anonymous class and Thread inside also anonymous)
        //after creating started thread immediately
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //start task in background thread
                new Thread(()->{
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Working...");
                        try{
                            Thread.sleep(2000); //imitating work
                        }catch (InterruptedException ex){
                            Thread.currentThread().interrupt();
                        }
                    }
                }).start();
            }
        });

        //setting for frame:
        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
