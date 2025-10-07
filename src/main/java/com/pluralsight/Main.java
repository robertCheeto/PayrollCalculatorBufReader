package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput "";

        System.out.println("Please enter the number corresponding with the file you want to process...");
        System.out.print("1) employees.csv OR 2) employeesExport.csv: ");
        int userChoice = keyboard.nextInt();
        keyboard.nextLine();

        switch (userChoice) {
            case(1):
                processEmployeeCSV();
                System.out.print("Would you like to rename the output of the file? (Y/N)");
                userInput = keyboard.nextLine().toLowerCase().trim();
                switch (userInput) {
                    case("y"):
                        System.out.print("Please enter the name of the file: ");
                        userInput = keyboard.nextLine();
                    case("n"):
                        break;
                }
                break;
            case(2):
                processEmployeeCSV();
                System.out.println("hehe");
                break;
            default:
                System.out.println("Please enter a proper file name");
        } // end of switch statement

        } // end of main()

    public static void processEmployeeCSV() {
        Employee[] employeeList = new Employee[10];
        int count = 0;

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(userInput);
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

        } catch (IOException e) {
            e.printStackTrace();
        } // and of try and catch
    } // end of processCSV

    }

