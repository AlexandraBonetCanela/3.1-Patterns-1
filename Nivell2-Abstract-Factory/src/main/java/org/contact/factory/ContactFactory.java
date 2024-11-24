package org.contact.factory;

import org.contact.model.Address;
import org.contact.model.Telephone;

public interface ContactFactory {

    public Telephone createTelephone(String number);
    public Address createAddress(String street, String city, String postCode, String region);
}
