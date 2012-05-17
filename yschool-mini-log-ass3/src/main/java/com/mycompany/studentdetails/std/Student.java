/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentdetails.std;

/**
 *
 * @author logarajah
 */
public class Student {
    private String firstname;
    private String grade;
    private String lastname;
    private String address;
 public Student(String firstname, String grade, String lastname, String address) {
        this.firstname = firstname;
        this.grade = grade;
        this.lastname = lastname;
        this.address = address;
    }

    public Student() {
       
    }
    
    public String getGrade() {
        return grade;
    }

    public String getAddress() {
        return address;
    }

   
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getFirstname() {
        return firstname;
    }

    
    public String getLastname() {
        return lastname;
    }

   
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
