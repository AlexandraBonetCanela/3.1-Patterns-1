package org.contact;

import org.contact.factory.ContactFactory;
import org.contact.factory.UKContactFactory;
import org.contact.factory.USContactFactory;

public class Main {
    public static void main(String[] args) {

        Directory directory = new Directory();

        ContactFactory uSContact = new USContactFactory();
        uSContact.createAddress("Trump street", "Ney York","0110", "New York");
        uSContact.createTelephone("908668944");

        ContactFactory uKContact = new UKContactFactory();
        uKContact.createAddress("Junction Road", "London", "N19 5QZ", "London");
        uKContact.createTelephone("90456888");

        directory.add(uSContact);
        directory.add(uKContact);
    }
}