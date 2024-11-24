package org.contact.model;

public class UKAddress extends Address {
    private String county;


    public UKAddress(String street, String city, String postCode, String county) {
        super(street, city, postCode);
        this.county = county;
    }

    @Override
    public void getAddress() {
        System.out.println("UK address: Street: " + street  + " City:  " + city + " PostCode: " + postCode + " County: " + county);
    }
}
