package com.vladproduction.srp.employee_architecture;

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType){
            case XML -> formattedOutput = convertObjectToXml(object);
            case CSV -> formattedOutput = convertObjectToCsv(object);
        }
    }

    private String convertObjectToXml(Object object){
        return "converted to XML: " + object.toString();
    }

    private String convertObjectToCsv(Object object){
        return "converted to CSV: " + object.toString();
    }
}
