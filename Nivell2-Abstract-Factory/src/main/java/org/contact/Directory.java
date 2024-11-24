package org.contact;


import org.contact.factory.ContactFactory;

import java.util.ArrayList;

public class Directory {

    ArrayList<ContactFactory> directory = new ArrayList<>();

    public void add(ContactFactory factory) {
        directory.add(factory);
    }
}
