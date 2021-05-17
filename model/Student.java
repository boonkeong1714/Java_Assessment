package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//extends from Person.class
public class Student extends Person implements Evaluation {
    private double average;
    public final List<Course> courses = new ArrayList<>();                 //enrollToCourse
    private final Map<String, Course> approvedCourses = new HashMap<>();    //registerApprovedCourse: courseId, course object
    private Map<Course, Integer> coursesGrade = new HashMap<>();             //BK: declare a hashmap to store grades

    //constructor
    public Student( String id, String name, String email, Date birthDate ) {
        super( id, name, email, birthDate );
    }

    //case 3
//    public void gradeCourses( Course course ) {
//
//    }


    //case 4: to do: ok
    public void enrollToCourse( Course course ) {
        //TODO implement this method: ok
        courses.add( course );  //BK: courses is arraylist: (object, object)
        coursesGrade.put( course, 0 );     //BK: add course and default grade=0
        //enrolledStudents.get( courseId ).add( student );
    }

    public void registerApprovedCourse( Course course ) {
        approvedCourses.put( course.getCode(), course );
    }

    //to do
    public boolean isCourseApproved( String courseCode ) {
        //TODO implement this method
        return false;
    }

    //to do
    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses( Course course ) {
        //TODO implement this method
        return null;
    }

    //to do
    public boolean isAttendingCourse( String courseCode ) {
        //TODO implement this method
        return false;
    }

    @Override
    public double getAverage() {
        return average;
    }

    //to do
    @Override
    public List<Course> getApprovedCourses() {
        //TODO implement this method
        return null;
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() + "}";
    }
}
