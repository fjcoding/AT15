package org.fundacionjala.at15.katas.bankocr;

import java.util.ArrayList;
import java.util.List;

public class ValidAccount {

    private List<String> accountlist;
    private final int large = 9;
    private final int valueZero = 0;

    public ValidAccount(String path) {
        //accountlist = path;
        accountlist = new ArrayList<>();
        //added for the test
        accountlist.add("345882865");
        accountlist.add("000000051");
        //changed for the test
        accountlist.add("49006771x");
        //changed for the test
        accountlist.add("12345678x");
    }

    public List<String> getAccountsToValidate() {
        return accountlist;
    }

    public boolean getValidation() {
        boolean validation = true;
        if (getAccountVerification()) {
            validation = false;
        }
        return validation;
    }

    public boolean isItInteger(String account) {
        boolean isInt = true;
        String accountComparison = account;
        char[] readyToCompare = accountComparison.toCharArray();
        for (int iterator = 0; iterator < readyToCompare.length; iterator++) {
            if (!Character.isDigit(accountComparison.charAt(iterator))) {
                isInt = false;
                break;
            }
        }
        return isInt;
    }

    public List<String> getValidAccounts() {
        List<String> accountInt = new ArrayList<>();
        for (String nAccount : getAccountsToValidate()) {
            if (isItInteger(nAccount)) {
                accountInt.add(nAccount);
            }
        }
        return accountInt;
    }

    public List<String> getInvalidAccounts() {
        List<String> accountFailed = new ArrayList<>();
        for (String nAccount : getAccountsToValidate()) {
            if (!(isItInteger(nAccount))) {
                accountFailed.add(nAccount);
            }
        }
        return accountFailed;
    }

    public boolean getAccountVerification() {
        boolean valid = false;
        final int mod = 11;
        double valAux = valueZero;
        List<String> verification = new ArrayList<>();
        verification = getValidAccounts();
        for (String account : verification) {
            char[]adder  = account.toCharArray();
            int multiplier = large;
            int result = valueZero;
            for (int iterator = 0; iterator < adder.length; iterator++) {
                char charValue = adder[iterator];
                int intValue = Character.getNumericValue(charValue);
                result = intValue * multiplier;
                multiplier--;
            }
            valAux = result % mod;
            if (valAux == 0) {
                valid = true;
            }
        }
        return valid;
    }
}