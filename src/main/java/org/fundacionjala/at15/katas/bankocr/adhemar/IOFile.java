package org.fundacionjala.at15.katas.bankocr.adhemar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOFile {
    private String path;
    private String stringContent;

    private static final int LINES_ENTRY = 4;
    private static final int CHARACTES_LINE = 28;

    public IOFile(String path) {
        this.path = path;
        this.stringContent = "";
        this.readFile();
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

    public boolean verifyFile() {
        return this.stringContent.split("\n").length % LINES_ENTRY == 0 && this.stringContent.length() % CHARACTES_LINE == 0;
    }

    public String[] getEntries() {
        String[] lines = this.stringContent.split("\n");
        int count = 0;
        String[] entries = new String[this.stringContent.split("\n").length / LINES_ENTRY];
        for (int index = 0; index < entries.length; index++) {
            entries[index] = "";
        }

        for (int index = 0; index < lines.length; index++) {
            if ((index + 1) % LINES_ENTRY != 0) {
                entries[count] += lines[index];
            } else {
                count++;
            }
        }
        return entries;
    }
}
