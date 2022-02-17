package org.fundacionjala.at15.katas.banckorc;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.fundacionjala.at15.katas.bankocr.ValidAccount;
import org.junit.Test;

public class validAccountTest {

    @Test
    public void itShouldBeValidAccount() {
        boolean valid = true;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(valid, vAccount.getValidation());
    }

    @Test
    public void shouldBeAccountsToValidate() {
        boolean validate = true;
        boolean emptyList = false;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        if (vAccount.getAccountsToValidate() != null) {
            emptyList = true;
        }
        assertEquals(validate, emptyList);
    }

    @Test
    public void itShouldBeIntegers() {
        boolean valid = true;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(valid, vAccount.isItInteger(""));
    }

    @Test
    public void shouldGetTheValidAccounts() {
        boolean validAccount = true;
        boolean valisList = false;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        if (vAccount.getValidAccounts() != null) {
            valisList = true;
        }
        assertEquals(validAccount, valisList);
    }

    @Test
    public void shouldGetTheIvalidAccounts() {
        boolean invalidAccount = true;
        boolean invalisList = false;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        if (vAccount.getInvalidAccounts() != null) {
            invalisList = true;
        }
        assertEquals(invalidAccount, invalisList);
    }

    @Test
    public void checkShouldBeZero() {
        boolean check = false;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(check, vAccount.getAccountVerification());
    }
}