package org.contact.model;

public class USAddress extends Address {
    private String state;

    public USAddress(String street, String city, String postCode, String state) {
        super(street, city, postCode);
        this.state = state;
    }


    @Override
    public void getAddress() {
        System.out.println("US address: Street: " + street  + " city:  " + city + " PostCode: " + postCode + " State: " + state);
    }
}
