package HomeWorkApp8;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setVisible(true);
        setLocation(650, 250);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton firstButton = new JButton("Выход");
        ActionListener firstListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        firstButton.addActionListener(firstListener);
        JButton secondButton = new JButton("Вторая кнопка");
        ActionListener secondListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        };
        secondButton.addActionListener(secondListener);
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(secondButton);
        panel.add(firstButton);

        add(panel, BorderLayout.SOUTH);

    }
}
