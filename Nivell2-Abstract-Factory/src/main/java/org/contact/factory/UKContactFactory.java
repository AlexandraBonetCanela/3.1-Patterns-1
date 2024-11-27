package org.contact.factory;

import org.contact.model.Address;
import org.contact.model.Telephone;
import org.contact.model.UKAddress;
import org.contact.model.UKTelephone;

public class UKContactFactory implements ContactFactory {
    @Override
    public Telephone createTelephone(String number) {

        return new UKTelephone(number);
    }

    @Override
    public Address createAddress(String street, String city, String postCode, String county) {

        return new UKAddress(street, city, postCode, county);
    }
}
