package de.brightslearning.java.advanced.designpattern.exercise.erik;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandLinePrinter implements ActionListener {


    // Schlechtes Design
    private String inputText;

    public CommandLinePrinter(String inputText) {
        this.inputText = inputText;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        System.out.println(inputText);
    }
}
