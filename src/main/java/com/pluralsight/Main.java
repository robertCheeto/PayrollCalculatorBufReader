package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String employeeList;

            while ((employeeList = bufReader.readLine()) != null) {
                employeeList.split("\\|");
                // maybe need a loop that says while bufReader is not null,
                // take the variable, convert it, and then place it in the array
                Employee[] employee = { new Employee(Integer.parseInt(employeeList), employeeList, Integer.parseInt(employeeList), Integer.parseInt(employeeList))};
                System.out.println(employee[0]);


            } // end of while loop
            bufReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } // and of try and catch


    } // end of main()

    // potentially create a method to correctly parse data from the csv into variable types

}
