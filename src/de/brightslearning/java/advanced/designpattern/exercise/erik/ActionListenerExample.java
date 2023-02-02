package de.brightslearning.java.advanced.designpattern.exercise.erik;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;


public class ActionListenerExample implements ActionListener {
    private final TextField textField = new TextField();
    private final Label label = new Label();

    // Model / Datenhaltung
    private String currentText = "";
    // Model / Datenhaltung
    private final Set<String> history = new HashSet<>();
    private final MyLabel anotherLabel = new MyLabel(history);
    private CommandLinePrinter commandLinePrinter = new CommandLinePrinter(currentText);

    public static void main(String[] args) {
        ActionListenerExample actionListenerExample = new ActionListenerExample();
        actionListenerExample.init();
        actionListenerExample.initAnotherFrame();
    }

    private void init() {
        Frame frame = new Frame("ActionListener Example");

        textField.setBounds(50, 50, 150, 20);

        Button button = new Button("Click Here");
        button.setBounds(50, 100, 300, 30);

        label.setBounds(50, 200, 150, 20);

        button.addActionListener(this);
        button.addActionListener(commandLinePrinter);
        button.addActionListener(anotherLabel);
        frame.add(button);
        frame.add(textField);
        frame.add(label);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void initAnotherFrame() {
        Frame frame = new Frame("Another Frame");

        anotherLabel.setBounds(0, 0, 200, 200);
        frame.add(anotherLabel);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        currentText = textField.getText();
        label.setText(currentText);
        history.add(currentText);
    }

}