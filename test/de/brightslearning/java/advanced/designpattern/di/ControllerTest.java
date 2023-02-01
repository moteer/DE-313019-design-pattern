package de.brightslearning.java.advanced.designpattern.di;

import java.util.Collection;

public class ControllerTest {
    public static void main(String[] args) {
        new Controller(new MockIbanValidor());
    }
}
