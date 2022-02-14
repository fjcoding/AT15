package org.fundacionjala.at15.katas.langtonant.alvarotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.fundacionjala.at15.katas.bankocr.alvaro.Data;
import org.junit.Test;

public class DataTest {

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
    public void itshouldbecomparedtozeromatrixwithdatafailure() {
        char [][] zero = {{' ','_',' '},
                         {'|',' ','.'},
                         {'|','_','|'}};
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumberzero(zero));

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
    public void itshouldbecomparedtoonematrixwithdatafailure() {
        char [][] one = {{' ',' ',' '},
                         {'|',' ','.'},
                         {'|','_',' '}};
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumberone(one));

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
    public void itshouldcomparewithtwomatrixwithdatafailure() {
        char [][] two = {{' ','_',' '},
                         {' ','_','|'},
                         {'.','_',' '}};
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumbertwo(two));

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
    public void itshouldcomparewiththreematrixwithdatafailure() {
        char [][] three = {{' ','_',' '},
                           {' ','_','|'},
                           {'.','_','|'}};
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumberthree(three));

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
    public void itshouldcomparewithfourmatrixwithdatafailure() {
        char [][] four = {{' ',' ','Z'},
                          {'|','_','|'},
                          {' ',' ','|'}};
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumberfour(four));

    }
    @Test
    public void itshouldcomparewithfivematrix() {
        char [][] five = {{' ','_',' '},
                         {'|','_',' '},
                         {' ','_','|'}};
        Data newData = new Data();
        assertEquals(true,Data.comparewithnumberfive(five));

    }
    @Test
    public void itshouldcomparewithfivematrixwithdatafailure() {
        char [][] five = {{' ','_',' '},
                         {'|','_','.'},
                         {' ','_','|'}};;
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumberfive(five));

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
    public void itshouldcomparewithsixmatrixwithdatafailure() {
        char [][] six = {{' ','_','.'},
                         {'|','_',' '},
                        {'|','_','|'}};
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumbersix(six));

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
    public void itshouldcomparewithsevenmatrixwithdatafailure() {
        char [][] seven= {{' ','_',' '},
                         {' ',' ','|'},
                         {' ',' ','.'}};
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumberseven(seven));

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
    public void itshouldcomparewitheightmatrixwithdatafailure() {
        char [][] eigth = {{' ','_',' '},
                         {'|','_','.'},
                         {'|','_','|'}};
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumbereigth(eigth));

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
    public void itshouldcomparewithninematrixwithdatafailure() {
        char [][] nine = {{' ','_',' '},
                         {'|','_','|'},
                         {' ','_','.'}};
        Data newData = new Data();
        assertEquals(false,Data.comparewithnumbernine(nine));

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
    public void itshouldfailifasmallerdataissenttoit() {
        int numbers[] = {1,2,3,4};
        Data newData = new Data();
        assertEquals(false,Data.shownumbers(numbers) );
    }
    @Test
    public void itshouldbeabletotellifitsavalidaccount() {
        int numbers[] = {3, 4,5,8,8,2,8,6,5};
        Data newData = new Data();
        assertEquals(true, Data.checkifitisavalidaccount(numbers));
    }
    @Test
    public void itshouldbeabletotellifitsnotvalidaccount() {
        int numbers[] = {3, 4,5,8,8,2,8,6,9};
        Data newData = new Data();
        assertEquals(false, Data.checkifitisavalidaccount(numbers));
    }
    @Test
    public void itshouldreturnthenumberone() {
        char [][] one = {{' ',' ',' '},
                         {'|',' ',' '},
                         {'|',' ',' '}};
        Data newData = new Data();
        assertEquals(1,Data.comparenumbers(one));

    }
    @Test
    public void itshouldreturnthenumbertwo() {
        char [][] two = {{' ','_',' '},
                         {' ','_','|'},
                         {'|','_',' '}};
        Data newData = new Data();
        assertEquals(2,Data.comparenumbers(two));

    }
    @Test
    public void itshouldreturnthenumberthree() {
        char [][] three = {{' ','_',' '},
                           {' ','_','|'},
                           {' ','_','|'}};
        Data newData = new Data();
        assertEquals(3,Data.comparenumbers(three));

    }
    @Test
    public void itshouldreturnthenumberfour() {
        char [][] four = {{' ',' ',' '},
                          {'|','_','|'},
                          {' ',' ','|'}};
        Data newData = new Data();
        assertEquals(4,Data.comparenumbers(four));

    }
    @Test
    public void itshouldreturnthenumberfive() {
        char [][] five = {{' ','_',' '},
                         {'|','_',' '},
                         {' ','_','|'}};
        Data newData = new Data();
        assertEquals(5,Data.comparenumbers(five));

    }
    @Test
    public void itshouldreturnthenumbersix() {
        char [][] six = {{' ','_',' '},
                         {'|','_',' '},
                        {'|','_','|'}};
        Data newData = new Data();
        assertEquals(6,Data.comparenumbers(six));

    }
    @Test
    public void itshouldreturnthenumberseven() {
        char [][] seven= {{' ','_',' '},
                         {' ',' ','|'},
                         {' ',' ','|'}};
        Data newData = new Data();
        assertEquals(7,Data.comparenumbers(seven));

    }
    @Test
    public void itshouldreturnthenumbereight() {
        char [][] eigth = {{' ','_',' '},
                         {'|','_','|'},
                         {'|','_','|'}};
        Data newData = new Data();
        assertEquals(8,Data.comparenumbers(eigth));

    }
    @Test
    public void itshouldreturnthenumbernine() {
        char [][] nine = {{' ','_',' '},
                         {'|','_','|'},
                         {' ','_','|'}};
        Data newData = new Data();
        assertEquals(9,Data.comparenumbers(nine));

    }
    @Test
    public void itshouldreturnthenumberzero() {
        char [][] zero = {{' ','_',' '},
                         {'|',' ','|'},
                         {'|','_','|'}};
        Data newData = new Data();
        assertEquals(0,Data.comparenumbers(zero));

    }
    @Test
    public void itshouldreturnthenumberinvalidwithdatafailure() {
        char [][] datafailure = {{' ','_',' '},
                         {'|',' ','.'},
                         {'|','_','|'}};
        Data newData = new Data();
        assertEquals(10,Data.comparenumbers(datafailure));

    }

}
