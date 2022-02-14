package org.fundacionjala.at15.katas.langtonant.alvarotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.fundacionjala.at15.katas.bankocr.alvaro.Data;
import org.junit.Test;

public class DataTest {
    /**
    @Test
    public void itshouldread3timesthekeyboard(){
        Data newdata=new Data();
        assertNotNull(Data.readData());
        }
    */
    @Test
    public void itshouldaddeddatatomatrix() {
        Data newData=new Data();

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
        assertEquals(true,Data.comparewithnumberzero(zero));

    }
    @Test
    public void itshouldcomparewithonematrix() {
        char [][] one = {{' ',' ',' '},
                         {'|',' ',' '},
                         {'|',' ',' '}};
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumberone(one));

    }
    @Test
    public void itshouldcomparewithtwomatrix() {
        char [][] two = {{' ','_',' '},
                         {' ','_','|'},
                         {'|','_',' '}};
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumbertwo(two));

    }
    @Test
    public void itshouldcomparewiththreematrix() {
        char [][] three = {{' ','_',' '},
                           {' ','_','|'},
                           {' ','_','|'}};
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumberthree(three));

    }
    @Test
    public void itshouldcomparewithfourmatrix() {
        char [][] four = {{' ',' ',' '},
                          {'|','_','|'},
                          {' ',' ','|'}};
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumberfour(four));

    }
    @Test
    public void itshouldcomparewithfivematrix() {
        char [][] five = {{' ','_',' '},
                         {'|','_',' '},
                         {' ','_','|'}};;
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumberfive(five));

    }
    @Test
    public void itshouldcomparewithsixmatrix() {
        char [][] six = {{' ','_',' '},
                         {'|','_',' '},
                        {'|','_','|'}};
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumbersix(six));

    }
    @Test
    public void itshouldcomparewithsevenmatrix() {
        char [][] seven= {{' ','_',' '},
                         {' ',' ','|'},
                         {' ',' ','|'}};
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumberseven(seven));

    }
    @Test
    public void itshouldcomparewitheightmatrix() {
        char [][] eigth = {{' ','_',' '},
                         {'|','_','|'},
                         {'|','_','|'}};
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumbereigth(eigth));

    }
    @Test
    public void itshouldcomparewithninematrix() {
        char [][] nine = {{' ','_',' '},
                         {'|','_','|'},
                         {' ','_','|'}};
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumbernine(nine));

    }
    @Test
    public void itshoulreturnanumber() {
        Data newData = new Data();
        char [][] nine = {{' ','_',' '},
                         {'|','_','|'},
                         {' ','_','|'}};
        assertNotNull(Data.comparenumbers(nine));
    }
    @Test
    public void itshouldshownumbers() {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        Data newData = new Data();
        assertEquals(true,Data.shownumbers(numbers) );
    }
    @Test
    public void itshouldbeabletotellifitsavalidaccount() {
        int numbers[] = {3, 4,5,8,8,2,8,6,5};
        Data newData = new Data();
        assertEquals(true, Data.checkifitisavalidaccount(numbers));
    }

}
