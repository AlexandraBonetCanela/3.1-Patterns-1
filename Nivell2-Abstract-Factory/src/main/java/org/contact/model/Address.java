package org.contact.model;

public abstract class Address {
    protected String street;
    protected String city;
    protected String postCode;

    protected Address(String street, String city, String postCode) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }
    public abstract void getAddress();

    @Override
    public String toString() {
        return "Address: " +
                "street: " + street +
                ", city: " + city +
                ", postCode: " + postCode;
    }
}
