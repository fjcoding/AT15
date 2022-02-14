package org.fundacionjala.at15.katas.banckorc;

import static org.junit.Assert.assertEquals;
import org.fundacionjala.at15.katas.bankocr.ValidAccount;
import org.junit.Test;

public class validAccountTest {

    @Test
    public void itShouldBeValidAccount() {
        boolean valid = true;
        ValidAccount vAccount = new ValidAccount("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\validAccount.txt");
        assertEquals(valid, vAccount.getValidation());
    }
    
}
