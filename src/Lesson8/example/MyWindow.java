package Lesson8.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MyWindow extends JFrame {
    public MyWindow() {
        char DOT_EMPTY = '.';
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jbs[i] = new JButton(String.valueOf(DOT_EMPTY));
        }

        setLayout(new BorderLayout());
        add(jbs[0], BorderLayout.EAST);
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.SOUTH);
        add(jbs[3], BorderLayout.NORTH);
        add(jbs[4], BorderLayout.CENTER);
        JButton button = jbs[4];

     /*   MenuBar menuBar = new MenuBar();
        menuBar.add(new Menu("File"));
        setMenuBar(menuBar);

        JMenuBar jmenuBar = new JMenuBar();
        jmenuBar.add(new JMenu("JFile"));
        setJMenuBar(jmenuBar);
*/
        button.setToolTipText("smart button");
        jbs[1].setToolTipText("another example");

        jbs[1].addActionListener(this::processClick);
        // button.addActionListener(e -> processClick(button));
        button.addActionListener(this::processClick);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }

        });
    }

    private void processClick(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        System.out.println("Click " + button.getToolTipText());
        button.setText("X");
        System.out.println(button.getText());
    }



    public static void main(String[] args) {
        new MyWindow().setVisible(true);
    }
}







