package de.brightslearning.java.advanced.designpattern.exercise.erik;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class MyLabel extends Label implements ActionListener {
    private Set<String> history;

    public MyLabel(Set<String> history) {
        this.history = history;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setText(history.toString());
    }
}