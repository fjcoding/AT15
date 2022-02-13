//package org.fundacionjala.at15.katas.bankocr.alvaro.Data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.fundacionjala.at15.katas.bankocr.alvaro.Data;
import org.junit.Test;

public class DataTest {

    @Test
    public void itshouldread4timesthekeyboard(){
        Data newdata=new Data();
        assertEquals(3, newdata.readData());
        }
    @Test
    public void itshouldaddeddatatomatrix() {
        Data newData=new Data();
        char[][] mat= new char[3][27];;
        assertEquals(true, newData.addToMatrix("123456789123456789123456789",0));

    }
    @Test
    public void itshouldextractnumberin3x3matrix() {
        Data newData = new Data();
        int index = 0;
        assertNotNull(Data.extractnumberin3x3matrix(index));

    }
    @Test
    public void itshouldcomparewithzeromatrix() {
        char [][] zero = {{' ','_',' '},
                         {'|',' ','|'},
                         {'|','_','|'}};
        Data newData = new Data();
        assertEquals(true,newData.comparewithnumberzero(zero));

    }
}
