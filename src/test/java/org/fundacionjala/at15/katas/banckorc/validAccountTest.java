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
        List<String> exp = new ArrayList<>();
        //added for the test
        exp.add("345882865");
        exp.add("000000051");
        //changed for the test
        exp.add("49006771x");
        //changed for the test
        exp.add("12345678x");
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(exp, vAccount.getAccountsToValidate());
    }

    @Test
    public void itShouldBeIntegers() {
        boolean valid = true;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(valid, vAccount.isItInteger(""));
    }

    @Test
    public void shouldGetTheValidAccounts() {
        List<String> exp = new ArrayList<>();
        exp.add("345882865");
        exp.add("000000051");
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(exp, vAccount.getValidAccounts());
    }

    @Test
    public void shouldGetTheIvalidAccounts() {
        List<String> exp = new ArrayList<>();
        exp.add("49006771x");
        exp.add("12345678x");
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(exp, vAccount.getInvalidAccounts());
    }

    @Test
    public void checkShouldBeZero() {
        boolean check = false;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(check, vAccount.getAccountVerification());
    }
}