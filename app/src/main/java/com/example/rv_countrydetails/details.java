package com.example.rv_countrydetails;


public class details {

    private int ivFlag;
    private String number;
    private String Country;

    details(int ivFlag, String number,String Country) {
        this.ivFlag = ivFlag;
        this.number = number;
        this.Country = Country;
    }

    public int getIvFlag() {
        return ivFlag;
    }

    public String getNumber() {
        return number;
    }

    public String getCountry() {
        return Country;
    }
}
