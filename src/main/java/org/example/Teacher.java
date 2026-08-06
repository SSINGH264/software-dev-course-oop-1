package org.example;

public class Teacher {
    private String name; //private fields for name
    private String className; // private fields for className

    // Add private fields for name and className
    // Add a constructor that takes a name and className and initializes the corresponding fields
    // Add getter methods for name and className
    // Add setter methods for name and className
    // Add a toString method that returns the teacher's name and className in the following format:
    // name (className)


    public Teacher(String name, String className){ // This is the constructor
        this.name = name;
        this.className = className;
    }

    public String getName() { //getter for name
        return name;
    }
    public void setName(String name) { //setter for name
        this.name = name;
    }

    public String getClassName() { //getter for className
        return className;}

    public void setClassName(String className) { // setter for className
        this.className = className;
    }

    public String toString () {
        return name + " (" + className + ")";
    }

}