package org.contact.factory;

import org.contact.model.Address;
import org.contact.model.Telephone;
import org.contact.model.USAddress;
import org.contact.model.USTelephone;

public class USContactFactory implements ContactFactory {


    @Override
    public Telephone createTelephone(String number) {
        return new USTelephone(number);
    }

    @Override
    public Address createAddress(String street, String city, String postCode, String state) {

        return new USAddress(street, city, postCode, state);
    }
}
