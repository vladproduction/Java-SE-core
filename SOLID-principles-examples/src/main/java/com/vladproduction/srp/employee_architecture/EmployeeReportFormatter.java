package com.vladproduction.srp.employee_architecture;

public class EmployeeReportFormatter extends ReportFormatter{


    public EmployeeReportFormatter(Object object, FormatType formatType) {

        super(object, formatType);
    }

    public String getFormattedEmployee(){
        return formattedOutput;
    }
}
