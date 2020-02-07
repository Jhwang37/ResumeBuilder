package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    Scanner scan = new Scanner(System.in);
    private String name;
    private String emailAddress;
    private Education education;
    private Work work;
    private Skills skills;
    private ArrayList<Person> personList = new ArrayList<>();

    Education e1 = new Education();
    Work w1 = new Work();
    Skills s1 = new Skills();

    public void Start() {
        addPerson();
        e1.addEducation();
        w1.addWork();
        s1.addSkills();
        System.out.println("================================================");
        System.out.println(toString(personList));
        System.out.println("================================================");
    }
    public Person(){

    }

    public Person(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String toString(ArrayList<Person> personList) {
        return (this.getName() +
                "\n" + this.getEmailAddress() + "\n" +
                "\nEducation" +
                "\n"+ e1.getDegree() + " in " + e1.getMajor()) +
                "\n" + e1.getUniversity() + ", " + e1.getGraduationYear() + "\n" +
                "\nExperience" +
                "\n" + w1.getJobTitle() +
                "\n" + w1.getCompany() + ", " + w1.getStartDate() + "-" + w1.getEndDate() + "\n" +
                "\nSkills" +
                "\n" + s1.getSkillName() + ", " + s1.getSkillRating();
    }


    public Person addPerson() {
        Person p1 = new Person(name, emailAddress);
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your email address: ");
        emailAddress = scan.nextLine();
        personList.add(p1);
        return p1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
