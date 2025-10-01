package com.pluralsight;

public class Student {
    private String name;
    private int studentId;
    private double gpa;
    private boolean isEnrolled;



    public Student(String name, int studentId, double gpa, boolean isEnrolled) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }
    public Student() {
        this.name = "";
        this.studentId = 0;
        this.gpa = 0.0;
        this.isEnrolled = false;
    }
    public void enroll(){
        System.out.println("Enrolling " + this.getName() + "...");
        this.isEnrolled = true;

    }
    public void withdraw(){
        System.out.println("Withdrawing " + this.getName() + "...");
        this.isEnrolled = false;

    }

    public void updateGpa(double newgpa){
        System.out.println("Updating " + this.name + "'s GPA to " + newgpa + "...");
        this.gpa = newgpa;

    }

    public String addCourse(String test){
        System.out.println("Adding " + test + " to " + this.name + "'s curriculum");
        return test;

    }

    public String dropCourse(String test){
        System.out.println("Dropping " + test + " to " + this.name + "'s curriculum");
        return test;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }


    public void getProfile(Student person){
        StringBuilder sb = new StringBuilder();

        sb.append(person.getName()).append(" (ID:");
        sb.append(person.getStudentId()).append("): GPA: ");
        sb.append(person.getGpa()).append(", Status: ");
        sb.append(person.isEnrolled).append(System.lineSeparator());


        String myInfo = sb.toString();

        System.out.printf(myInfo);

    }

}
