package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.model.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class StudentService {
    private static final Map<String, Student> students = new HashMap<>();      //studentID = student object

    //BK: create some dummy students
    public void registerStudent( Student student ) {
        students.put( student.getId(), student );
    }

    //BK: constructor: add some students
    public StudentService() {
        Date d1 = new Date(109, 5, 23);
        Date d2 = new Date(108, 4, 22);
        Date d3 = new Date(107, 3, 21);
        Date d4 = new Date(106, 2, 20);
        registerStudent(new Student("S01", "BK", "BK@tp.edu.sg", d1));
        registerStudent(new Student("S02", "Lina", "Lina@tp.edu.sg", d2));
        registerStudent(new Student("S03", "JT", "JT@tp.edu.sg", d3));
        registerStudent(new Student("S04", "Remy", "Remy@tp.edu.sg", d4));
    }


    //case 1: add
    //student.getId() => Person.getId()
    public void subscribeStudent( Student student ) {
        students.put( student.getId(), student );
    }

    //case 2: read
    //students.containsKey( studentId )
    public Student findStudent( String studentId ) {
        if ( students.containsKey( studentId )) {
            return students.get( studentId );
        }
        return null;
    }


    //case 3: to do: ok
    public static boolean isSubscribed( String studentId, Course course ) {
        //TODO implement this method: ok
        return students.get(studentId).courses.contains(course);
    }

    //case 3
    public void gradeStudent( String studentId, Course course) {
//        students.gradeCourses();
    }


    //case 4: update
    //students.get( studentId ).enrollToCourse( course ): to do: ok
    public void enrollToCourse( String studentId, Course course ) {
        if ( students.containsKey( studentId )) {
            students.get( studentId ).enrollToCourse( course );
        }
    }

    //case 5: read: to do: ok
    public void showSummary() {
        //TODO implement: ok
        // BK: students is hashmap
        System.out.println("===== Students Summary =====");
        System.out.println("There are " + students.size() + " student(s) enrolled.");
        for (String i : students.keySet()) {
//            System.out.println("Student ID: " + i);
            System.out.println(students.get(i));
        }
    }
}
