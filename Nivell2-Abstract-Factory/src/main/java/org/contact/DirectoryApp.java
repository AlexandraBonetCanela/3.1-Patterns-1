package org.contact;

import org.contact.factory.ContactFactory;
import org.contact.factory.UKContactFactory;
import org.contact.factory.USContactFactory;


public class DirectoryApp {
    public static void main(String[] args) {

        Directory directory = new Directory();

        ContactFactory uSContact = new USContactFactory();
        directory.add(uSContact.createAddress("Trump street", "New York","0110", "New York"));
        directory.add(uSContact.createTelephone("908668944"));

        ContactFactory uKContact = new UKContactFactory();
        directory.add(uKContact.createAddress("Junction Road", "London", "N19 5QZ", "London"));
        directory.add(uKContact.createTelephone("90456888"));

        System.out.println(directory);
    }
}