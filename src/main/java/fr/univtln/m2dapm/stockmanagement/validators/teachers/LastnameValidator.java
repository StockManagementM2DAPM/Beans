package fr.univtln.m2dapm.stockmanagement.validators.teachers;

import fr.univtln.m2dapm.stockmanagement.annotations.teachers.ValidLastName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by toms on 12/21/16.
 */
public class LastnameValidator implements ConstraintValidator<ValidLastName, String> {

    @Override
    public void initialize(ValidLastName validFirstName) {
    }

    /**
     * Defines conditions to have for validate Fullname's lastname attribute instance
     * @param lastname
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(String lastname, ConstraintValidatorContext constraintValidatorContext) {
        if((lastname == null||lastname.length() < 2 )||(lastname.length() > 31))
        {
            return false;
        };
        return true;
    }


}
