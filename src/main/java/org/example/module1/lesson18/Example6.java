package org.example.module1.lesson18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class Example6 {
    public static void main(String[] args) {
        StudentComparator studentComparator = new StudentComparator();
        TreeMap<Student, Boolean> map = new TreeMap<>(studentComparator);
//        TreeMap<Student, Boolean> map = new TreeMap<>();
        map.put(new Student(1,2,3), true);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,2,3));

        Collections.sort(students, studentComparator);

    }
}


//library
class Student {

    public Student(int desing, int math, int english) {
        this.desing = desing;
        this.math = math;
        this.english = english;
    }

    //предмети
    int desing;
    int math;
    int english;
}

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        int gradeFirst = o1.desing + o1.english + o1.math;
        int gradeSecond = o2.desing + o2.english + o2.math;
        return Integer.compare(gradeFirst, gradeSecond);
    }
}
