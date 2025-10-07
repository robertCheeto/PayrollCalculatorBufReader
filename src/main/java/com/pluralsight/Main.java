package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            bufReader.readLine();

            while ((input = bufReader.readLine()) != null) {
                String[] parsedList = input.split("\\|");

                int id = Integer.parseInt(parsedList[0]);
                String name = parsedList[1];
                double  hoursWorked = Double.parseDouble(parsedList[2]);
                double  payRate = Double.parseDouble(parsedList[3]);

                Employee employeeList = new Employee(id, name, hoursWorked, payRate);
                System.out.printf("Employee ID: %d | Employee Name: %s | Gross Pay: $%.2f\n", employeeList.getEmployeeID(), employeeList.getEmployeeName(), employeeList.getGrossSalary());


            } // end of while loop
            bufReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } // and of try and catch


    } // end of main()

    // potentially create a method to correctly parse data from the csv into variable types

}
