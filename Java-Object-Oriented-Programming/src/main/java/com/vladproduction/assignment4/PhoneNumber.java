package com.vladproduction.assignment4;

public class PhoneNumber {

    private int countryCode;
    private String phoneNumber;

    public PhoneNumber(int countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    //phone number could include country code or not
    public PhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 5){
            this.countryCode = Integer.parseInt(phoneNumber.substring(0, phoneNumber.length() - 5));
            this.phoneNumber = phoneNumber.substring(phoneNumber.length() - 5);
        }
        else {
            this.countryCode = 1;
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
