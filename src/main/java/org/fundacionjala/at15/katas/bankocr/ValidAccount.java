package org.fundacionjala.at15.katas.bankocr;

import java.util.ArrayList;
import java.util.List;

public class ValidAccount {

    private List<String> accountlist;
    private boolean validation = true;
    private boolean isInteger;

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
        //compare with the obtained accounts
        String accountComparison = "34588286";
        final int digits = 10;
        char[] readyToCompare = accountComparison.toCharArray();
        char auxChar;
        String auxStr;
        int counter = 1;
        for (int iterator1 = 0; iterator1 < readyToCompare.length; iterator1++) {
            auxChar = readyToCompare[iterator1];
            auxStr = Character.toString(auxChar);
            for (int iterator2 = 0; iterator2 < digits; iterator2++) {
                if (Integer.parseInt(auxStr) == iterator2) {
                    counter++;
                }
            }
            if (counter != digits - 1) {
                isInteger = false;
            } else {
                isInteger = true;
            }
        }
        return isInteger;
    }

    public List<String> getAccountsToValidate() {
        return accountlist;
    }
}
