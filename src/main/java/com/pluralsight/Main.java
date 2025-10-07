package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try to read text from a file first before created the payroll calc
        try {
            FileReader fileReader = new FileReader("src/main/resources/goldilocks.txt");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String text;
            while ((text = bufReader.readLine()) != null) {
                System.out.println(text);
            }
            bufReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
