package de.brightslearning.java.advanced.designpattern.di;

import de.brightslearning.java.advanced.designpattern.di.iban.IbanValidationService;
import de.brightslearning.java.advanced.designpattern.di.iban.IbanValidationServiceImpl;

public class Controller {

    //@Autowire
    //@Inject
    private IbanValidationService ibanValidationService;

    public Controller(IbanValidationService ibanValidationService) {
        this.ibanValidationService = ibanValidationService;
    }

    public boolean validateIban() {

        boolean isValid = ibanValidationService.validate();
        if (isValid) {
            System.out.println("Super alles valide");
        } else {
            throw new RuntimeException("so gehts nicht weiter");
        }
        return isValid;
    }

    public void setIbanValidationService(IbanValidationService ibanValidationService) {
        this.ibanValidationService = ibanValidationService;
    }
}
