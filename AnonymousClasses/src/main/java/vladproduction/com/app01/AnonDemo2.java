package vladproduction.com.app01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonDemo2 {

    public static void main(String args[]) {

        // создать JFrame и добавить к нему перехватчик
        // событий для обработки закрытия окна

        JFrame frame = new JFrame("AnonDemo2");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // создать JPanel  и добавить к фрейму

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        frame.getContentPane().add(panel);

        // отобразить фрейм

        frame.pack();
        frame.setVisible(true);
    }
}
