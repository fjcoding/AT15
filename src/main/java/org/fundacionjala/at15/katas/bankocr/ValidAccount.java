package org.fundacionjala.at15.katas.bankocr;

/*import java.util.ArrayList;
import java.util.List;*/

public class ValidAccount {

    //private List<String> accountlist;
    private String account;
    private boolean validation = true;

    public ValidAccount(String path) {
        //accountlist = path;
        account = "345882865";
    }

    //convert list obtained from String to integer
    public int convertToInteger() {
        int accountInt = Integer.parseInt(account);
        return accountInt;
    }

    public void accountIsValid() {
    }

    public boolean getValidation() {
        return validation;
    }
}
