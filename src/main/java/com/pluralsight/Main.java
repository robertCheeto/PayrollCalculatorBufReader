package com.pluralsight;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Employee[] employeeList = new Employee[10];
        int count = 0;

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

                employeeList[count] = new Employee(id, name, hoursWorked, payRate);
                System.out.printf("Employee ID: %d | Employee Name: %s | Gross Pay: $%.2f\n", employeeList[count].getEmployeeID(), employeeList[count].getEmployeeName(), employeeList[count].getGrossSalary());
                count++;
            } // end of while loop
            bufReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } // and of try and catch

        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/employeesExport.csv");
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);


            } // end of while loop
            bufWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        } // and of try and catch

    } // end of main()

    // potentially create a method to correctly parse data from the csv into variable types

}
