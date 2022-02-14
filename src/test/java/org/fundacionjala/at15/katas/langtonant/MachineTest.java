package org.fundacionjala.at15.katas.langtonant;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.bankocr.saul.Machine;
import org.junit.Test;

public class MachineTest {
    @Test
    public void itShouldHaveANumberScanned() {
        String numberScanned = " _  _  _  _  _  _  _  _  _ \n" +
                               "| || || || || || || || || |\n" +
                               "|_||_||_||_||_||_||_||_||_|";
        Machine theMachine = new Machine(numberScanned);
        assertEquals(numberScanned, theMachine.getNumberScanned());
    }

    @Test
    public void itShouldConvertScannedNumbersCorrectly() {
        String numberScanned1 = " _  _  _  _  _  _  _  _    \n" +
                                "| || || || || || || ||_   |\n" +
                                "|_||_||_||_||_||_||_| _|  |";
        String numberScanned2 = "                           \n" +
                                "  |  |  |  |  |  |  |  |  |\n" +
                                "  |  |  |  |  |  |  |  |  |";
        String numberScanned3 = " _  _  _  _  _  _  _  _  _ \n" +
                                "|_||_||_||_||_||_||_||_||_|\n" +
                                "|_||_||_||_||_||_||_||_||_|";
        String numberScanned4 = " _  _  _  _  _  _  _  _  _ \n" +
                                "|_ |_ |_ |_ |_ |_ |_ |_ |_ \n" +
                                " _| _| _| _| _| _| _| _| _|";
        String numberScanned5 = " _  _  _  _  _  _  _  _  _ \n" +
                                "|_||_||_||_||_||_||_||_||_|\n" +
                                " _| _| _| _| _| _| _| _| _|";
        Machine theMachine1 = new Machine(numberScanned1);
        assertEquals("000000051", theMachine1.getIntNumber());
        Machine theMachine2 = new Machine(numberScanned2);
        assertEquals("111111111", theMachine2.getIntNumber());
        Machine theMachine3 = new Machine(numberScanned3);
        assertEquals("888888888", theMachine3.getIntNumber());
        Machine theMachine4 = new Machine(numberScanned4);
        assertEquals("555555555", theMachine4.getIntNumber());
        Machine theMachine5 = new Machine(numberScanned5);
        assertEquals("999999999", theMachine5.getIntNumber());
    }

    @Test
    public void itShouldGenerateReportNumber() {
        String numberScanned1 = " _  _  _  _  _  _  _  _    \n" +
                                "| || || || || || || ||_   |\n" +
                                "|_||_||_||_||_||_||_| _|  |";
        String numberScanned2 = "    _  _  _  _  _  _     _ \n" +
                                "|_||_|| || ||_   |  |  | _ \n" +
                                "  | _||_||_||_|  |  |  | _|";

        Machine theMachine1 = new Machine(numberScanned1);
        assertEquals("000000051", theMachine1.generateReport());
        Machine theMachine2 = new Machine(numberScanned2);
        assertEquals("49006771? ILL", theMachine2.generateReport());
    }
}
