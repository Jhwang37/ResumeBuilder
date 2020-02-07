package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Education {
    Scanner scan = new Scanner(System.in);
    private String degree;
    private String major;
    private String university;
    private String graduationYear;
    private boolean start = true;
    private ArrayList<Education> educationList = new ArrayList<Education>();

    public Education() {
    }

    public Education(String degree, String major, String university, String graduationYear) {
        this.degree = degree;
        this.major = major;
        this.university = university;
        this.graduationYear = graduationYear;
    }

    //adding input from user into constructor
    public ArrayList<Education> addEducation() {
        System.out.println("Time for Education!");
        while (start){
            System.out.println("Enter the University you attended: ");
        university = scan.nextLine();
        System.out.println("What was your major: ");
        major = scan.nextLine();
        System.out.println("What degree did you receive: ");
        degree = scan.nextLine();
        System.out.println("What was your graduation year: ");
        graduationYear = scan.nextLine();
        Education e1 = new Education(university, major, degree, graduationYear);
        educationList.add(e1);
        System.out.println("Add another? (y/n)");
        String input = scan.nextLine();
            if(input.equalsIgnoreCase("y")){
                continue;
            }else if(input.equalsIgnoreCase("n")){
                start = false;
            }
    }
        return educationList;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }
}
