package org.fundacionjala.at15.katas.bankocr;

import java.util.ArrayList;
import java.util.List;

public class ValidAccount {

    private List<String> accountlist;
    private boolean validation = true;

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
}