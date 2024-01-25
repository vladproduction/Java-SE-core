package com.vladproduction.srp.employee_architecture;

public class ClientModule {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", "economy", true);
        ClientModule.hireNewEmployee(employee);
        ClientModule.printEmployeeReport(employee, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee){
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
