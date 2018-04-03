package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XOWindow extends JFrame {
    public XOWindow() {
        setTitle("Крестики,нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton[] jbs = new JButton[25];
        setLayout(new GridLayout(5, 5));
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton();
            add(jbs[i]);
        }
        for (int i = 0; i <jbs.length ; i++) {
            jbs[i].addActionListener(e -> System.out.println("Button pressed..."));
        }
    }
}
