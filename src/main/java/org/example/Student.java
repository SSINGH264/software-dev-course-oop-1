package org.example;

public class Student { // this is the class
    private String name;
    private double grade;
    private int daysAbsent;

    public Student(String name, double grade, int daysAbsent) { // this is the constructor
        this.name = name;
        this.grade = grade;
        this.daysAbsent = daysAbsent;
    }

    public String getName() { //getter for name
        return name;
    }

    public double getGrade() { //getter for grade
        return grade;
    }

    public void setName(String name) { //setter for name
        this.name = name;
    }

    public void setGrade(double grade) { //setter for grade
        this.grade = grade;
    }

    public int getDaysAbsent() { // getter for days absent
        return daysAbsent;
    }

    public void setDaysAbsent(int daysAbsent) { //setter for days absent
        this.daysAbsent = daysAbsent;
    }

    public String toString() {
        return name + " " + grade;
    }

    public void addAbsence () {
        daysAbsent = daysAbsent + 1; // this adds one to day absent
    }

    public void addBonusPoints(double bonusPoints) {
        grade = grade + bonusPoints; //updating grate with the bonus points 
    }

    // Add a void method called addAbsence that increments the daysAbsent field by 1.
    // Add a void method called addBonusPoints that takes a double parameter bonusPoints and adds it to the grade field.
}
