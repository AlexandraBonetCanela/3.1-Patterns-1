package org.example;

public class USTelephone extends Telephone {

    public USTelephone(String number) {
        super(number);
        this.prefix = "+1";
    }

    @Override
    public void getTelephone() {
        System.out.println("US Telephone: " + this.prefix +this.number);
    }

}
