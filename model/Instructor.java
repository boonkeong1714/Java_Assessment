package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//extends from Person.class
public class Instructor extends Person {
    private int experienceMonths;
    private final List<Course> teachingCourses = new ArrayList<>();

    //constructor
    protected Instructor( String id, String name, String email, Date birthDate ) {
        super( id, name, email, birthDate );
    }

    //getter setter methods
    public int getExperienceMonths() { return experienceMonths; }
    public void setExperienceMonths( int experienceMonths ) { this.experienceMonths = experienceMonths; }
}
