package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try to read text from a file first before created the payroll calc
        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String employeeList;
            while ((employeeList = bufReader.readLine()) != null) {
                Employee employee = { new Employee(employeeList.split("\\|")) };
            }
            bufReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
