package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    public enum IOService {CONSOLE_IO, FILE_IO, DB_I0, REST_IO};
    public static List<EmployeePayrollData> employeePayrollList;
    public EmployeePayRollService() {}
    public EmployeePayRollService(List<EmployeePayrollData> employeePayrollList) {}

    public static void main(String[] args) {
        employeePayrollList = new ArrayList<>();
        EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID:");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name:");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary : ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
}

