package com.prueba;

import javax.swing.*;
public class prueba extends JFrame {
    JFrame frame;

    prueba() {
        setTitle("EPISI Wallet");

        JButton button = new JButton("click");
        button.setBounds(100, 100, 115, 55);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prueba();
    }
}
