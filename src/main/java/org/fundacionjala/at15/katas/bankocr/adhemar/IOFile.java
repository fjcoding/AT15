package org.fundacionjala.at15.katas.bankocr.adhemar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOFile {
    private String path;
    private String stringContent;

    IOFile(String path) {
        this.path = path;
        this.stringContent = "";
    }

    public String getPath() {
        return this.path;
    }

    public String getStringContent() {
        return this.stringContent;
    }

    public void readFile() {
        File inputFile = new File(this.path);
        try {
            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            String line = input.readLine();
            while (line != null) {
                this.stringContent += line + "\n";
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
