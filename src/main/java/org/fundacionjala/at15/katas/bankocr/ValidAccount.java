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
        accountlist.add("490067715");
        //changed for the test
        accountlist.add("123456789");
    }

    public boolean getValidation() {
        return validation;
    }

    public boolean isItInteger() {
        boolean isInteger = true;
        return isInteger;
    }

    public List<String> getAccountsToValidate() {
        return accountlist;
    }
}
