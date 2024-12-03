package org.contact.model;

public class Contact {
    private String name;
    private Telephone telephone;
    private Address address;

    public Contact(String name, Telephone telephone, Address address) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
    }
}
