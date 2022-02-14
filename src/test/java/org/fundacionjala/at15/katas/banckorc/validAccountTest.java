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
        exp.add("490067715");
        //changed for the test
        exp.add("123456789");
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(exp, vAccount.getAccountsToValidate());
    }

    @Test
    public void itShouldBeIntegers() {
        boolean valid = true;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(valid, vAccount.getValidation());
    }
}