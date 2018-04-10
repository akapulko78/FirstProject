package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class XOWindow extends JFrame {
    private static final String DOT_X = "X";
    private static final String DOT_O = "O";
    private static Random random = new Random();
    private static int emptyFields = 25;


    private XOWindow() {
        setTitle("Крестики,нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton[] jbs = new JButton[25];
        setLayout(new GridLayout(5, 5));
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton();
            add(jbs[i]);
        }
        while (true) {
            if (isFilled()) {
                System.out.println("Ничья");
                return;
            } else {
                clickHuman(jbs);
                clickComputer(jbs);
            }
        }
    }

    private void processClickHuman(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setText(DOT_X);
        emptyFields--;
        System.out.println(emptyFields);
        // System.out.println("Click " + button.getToolTipText());

        //System.out.println(button.getText());
    }

    private void clickHuman(JButton[] jbs) {
        for (int i = 0; i < jbs.length; i++) {
            if (jbs[i].getText().isEmpty())
                jbs[i].addActionListener(this::processClickHuman);
            jbs[i].addActionListener(e -> System.out.println("Ход совершен"));
        }
    }

    private static void clickComputer(JButton[] jbs) {

        int preStep = random.nextInt(25);

        while (!(jbs[preStep].getText().isEmpty())) {
            if (preStep >= 25) {
                preStep = 1;
            }
            preStep++;
        }
        jbs[preStep].setText(DOT_O);
        emptyFields--;
    }

    public static void main(String[] args) {
        new XOWindow().setVisible(true);
    }

    private static boolean isFilled() {
        return emptyFields <= 0;
    }
}



