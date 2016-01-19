package ru.pangaia.erudit.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by rb2o2 on 19.01.16.
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        super();
        this.setName("ЭРУ");
        this.setTitle("ЭРУДИТ v.0.1");
        setSize(400,400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }

        });
        Component cmp = new JTable(15,15);
        add(cmp);
    }
}
