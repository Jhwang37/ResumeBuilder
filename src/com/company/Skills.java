package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Skills {
    Scanner scan = new Scanner(System.in);
    private String skillName;
    private String skillRating;
    private ArrayList<Skills> skillList = new ArrayList<Skills>();
    boolean start = true;

    public Skills() {
    }

    public Skills(String skillName, String rating) {
        this.skillName = skillName;
        this.skillRating = rating;
    }

    public ArrayList<Skills> addSkills() {
        System.out.println("Time to enter what you're all about: ");
        System.out.println("Enter your skill name: ");
        skillName = scan.nextLine();
        System.out.println("Enter your skill rating: ");
        skillRating = scan.nextLine();
//        System.out.println("Add another skill? (y/n)");
//        String input = scan.nextLine();
        Skills skills = new Skills(skillName, skillRating);
        skillList.add(skills);
        return skillList;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillRating() {
        return skillRating;
    }

    public void setSkillRating(String rating) {
        this.skillRating = rating;
    }
}
