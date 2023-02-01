package de.brightslearning.java.advanced.designpattern.di;

import de.brightslearning.java.advanced.designpattern.di.iban.IbanValidationService;

public class MockIbanValidor implements IbanValidationService {
    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public ValidationeResult validateWithMessage() {
        return new ValidationeResult(false, "das ist nur ein Mock validator");
    }
}
