package de.brightslearning.java.advanced.designpattern.di.iban;

import de.brightslearning.java.advanced.designpattern.di.ValidationeResult;

public interface IbanValidationService {
    public boolean validate();

    public ValidationeResult validateWithMessage();
}
