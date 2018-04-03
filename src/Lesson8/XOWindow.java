package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class XOWindow extends JFrame {
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static Random random = new Random();

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
            jbs[i].addActionListener(e -> System.out.println("Ход совершен"));
        }
        for (int i = 0; i <jbs.length ; i++) {
            if(!jbs[i].getText().equals(String.valueOf(DOT_O)))
                jbs[i].addActionListener(this::processClickHuman);
            else
                jbs[i].addActionListener(this::processClickComputer);
        }

    }

    private void processClickHuman(ActionEvent e) {
        JButton button = (JButton) e.getSource();
       // System.out.println("Click " + button.getToolTipText());
        button.setText("X");
        //System.out.println(button.getText());
    }
    private void processClickComputer(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        // System.out.println("Click " + button.getToolTipText());
        button.setText("O");
        //System.out.println(button.getText());
    }

    public static void main(String[] args) {
        new XOWindow().setVisible(true);
    }
}

//Пока успел реализовать только ход человека, остальное - в процессе написания.
