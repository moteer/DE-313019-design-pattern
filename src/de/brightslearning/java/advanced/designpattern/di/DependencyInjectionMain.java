package de.brightslearning.java.advanced.designpattern.di;

import de.brightslearning.java.advanced.designpattern.di.iban.IbanValidationServiceImpl;
import de.brightslearning.java.advanced.designpattern.di.iban.NewGenerationIbanValidationServiceImpl;

import java.util.ArrayList;

public class DependencyInjectionMain {

    public static void main(String[] args) {
        Controller controller = new Controller(new IbanValidationServiceImpl());


        Controller controller2 = new Controller(new NewGenerationIbanValidationServiceImpl());
    }




}
