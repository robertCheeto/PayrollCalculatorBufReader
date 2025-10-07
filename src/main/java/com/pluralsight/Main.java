package com.pluralsight;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Employee[] employeeList = new Employee[10];
        int count = 0;

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("src/main/resources/employeeExport.csv");
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            String input;
            bufWriter.write("id|name|gross pay\n");

            while ((input = bufReader.readLine()) != null) {
                String[] parsedList = input.split("\\|");
                if (!parsedList[0].equals("id")) {
                    int id = Integer.parseInt(parsedList[0]);
                    String name = parsedList[1];
                    double hoursWorked = Double.parseDouble(parsedList[2]);
                    double payRate = Double.parseDouble(parsedList[3]);

                    employeeList[count] = new Employee(id, name, hoursWorked, payRate);
                    System.out.printf("Employee ID: %d | Employee Name: %s | Gross Pay: $%.2f\n", employeeList[count].getEmployeeID(), employeeList[count].getEmployeeName(), employeeList[count].getGrossSalary());

                    bufWriter.write(employeeList[count].getEmployeeID() + "|" + employeeList[count].getEmployeeName() + "|" + employeeList[count].getGrossSalary() + "\n");

                    count++;
                } // end of if statement
            } // end of while loop
            bufReader.close();
            bufWriter.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        } // and of try and catch


    } // end of main()
}