package com.generation.model;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract public class Person {
    private final String id;
    private final String name;
    private final String email;
    private final Date birthDate;

    //constructor
    protected Person( String id, String name, String email, Date birthDate ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    //getter methods
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Date getBirthDate() { return birthDate; }

    @Override
    public String toString() {
//        return id + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", birthDate=" + birthDate;
//        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", DOB: " + birthDate;
        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", DOB: " + new SimpleDateFormat("yyyy-MM-dd").format(birthDate);

    }
}
