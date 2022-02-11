package org.fundacionjala.at15.katas.bankocr;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTXT {
    public String readTxtFile(String direction) {
       String capturedText="";
        try{
            BufferedReader buffer=new BufferedReader(new FileReader(direction));
            String temporaryText = "";
            String bufferRead;
            while((bufferRead = buffer.readLine()) != null) {
                temporaryText = temporaryText + bufferRead;
        }
        capturedText=temporaryText;
        } catch(Exception e){System.out.println("File does not exist: ");
        } return capturedText;
    }    
}