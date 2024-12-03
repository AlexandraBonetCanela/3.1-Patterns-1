package org.contact;

import java.util.ArrayList;

public class Directory {

    ArrayList<Object> directory = new ArrayList<>();

    public void add(Object object) {

        directory.add(object);
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        directory.forEach((contactFactory) -> result.append(contactFactory.toString()).append("\n"));

        return result.toString();
    };
}
