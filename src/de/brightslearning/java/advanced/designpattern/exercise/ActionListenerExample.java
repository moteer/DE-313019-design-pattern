package de.brightslearning.java.advanced.designpattern.exercise;

import java.awt.*;
import java.awt.event.*;

//1st step
public class ActionListenerExample implements ActionListener {
    final TextField tf = new TextField();

    public static void main(String[] args) {
        ActionListenerExample actionListenerExample = new ActionListenerExample();
        actionListenerExample.init();
    }

    private void init() {
        Frame f = new Frame("ActionListener Example");
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        //2nd step
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    //3rd step
    public void actionPerformed(ActionEvent e) {
        tf.setText("Hier passiert was.");
    }
}  