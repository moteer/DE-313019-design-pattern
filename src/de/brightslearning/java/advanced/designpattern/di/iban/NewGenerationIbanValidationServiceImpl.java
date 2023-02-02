package de.brightslearning.java.advanced.designpattern.di.iban;

import de.brightslearning.java.advanced.designpattern.di.ValidationeResult;

public class NewGenerationIbanValidationServiceImpl implements IbanValidationService {
    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public ValidationeResult validateWithMessage() {
        return null;
    }
}
