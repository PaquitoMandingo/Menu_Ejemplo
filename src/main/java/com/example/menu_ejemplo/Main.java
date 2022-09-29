package com.example.menu_ejemplo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        JFrame frame1 = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JMenu menuA = new JMenu("Archivo");
        JMenuItem ItemQuitar = new JMenuItem("Quitar");
        JMenuItem ItemSiguiente = new JMenuItem("Siguiente");
        JMenuItem ItemP = new JMenuItem("Intento-2");

        ItemQuitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuA.add(ItemQuitar);
        menuBar.add(menuA);
        menuA.add(ItemSiguiente);
        menuBar.add(menuA);
        menuA.add(ItemP);
        menuBar.add(menuA);

        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
        frame1.setSize(400,400);
        frame1.setLocationRelativeTo(null);
        frame1.setJMenuBar(menuBar);
        frame1.setVisible(true);
    }
}
