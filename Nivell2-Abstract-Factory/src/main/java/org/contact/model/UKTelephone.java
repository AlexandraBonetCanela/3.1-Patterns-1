package org.contact.model;

public class UKTelephone extends Telephone {

    public UKTelephone(String number) {
        super(number);
        this.prefix = "+44";
    }

    @Override
    public void getTelephone() {
        System.out.println("UK Telephone: " + this.prefix +this.number);
    }
}
