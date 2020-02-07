package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Work {
    Scanner scan = new Scanner(System.in);
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String jobDescription;
    private ArrayList<Work> workList = new ArrayList<Work>();

    public Work() {
    }

    public Work(String company, String jobTitle, String jobDescription,
                String startDate, String endDate) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDescription = jobDescription;
    }

    //adding input from user into constructor
    public ArrayList<Work> addWork() {
        System.out.println("Lets enter your work history");
        System.out.println("Enter your Company: ");
        company = scan.nextLine();
        System.out.println("Enter your job title: ");
        jobTitle = scan.nextLine();
        System.out.println("Enter your job description: ");
        jobDescription = scan.nextLine();
        System.out.println("Enter your start date: ");
        startDate = scan.nextLine();
        System.out.println("Enter your end date: ");
        endDate = scan.nextLine();
        Work w1 = new Work(company,jobTitle,jobDescription,startDate,endDate);
        workList.add(w1);
        return workList;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }


}
