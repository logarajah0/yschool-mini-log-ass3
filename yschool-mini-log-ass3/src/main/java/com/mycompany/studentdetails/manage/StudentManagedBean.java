/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentdetails.manage;

import com.mycompany.studentdetails.std.Student;
import com.mycompany.studentdetails.std.Studentservice;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author logarajah
 */
@ManagedBean
@RequestScoped
public class StudentManagedBean {

    private Student confirm;
    private List<Student>students;
    private String sname;
    private String lname;
    private String grade;
    private String address;
    public StudentManagedBean() {
        students=Studentservice.getStudents();
        confirm=new Student();
        sname=confirm.getFirstname();
        
    }
    public String responsePage()
    {
        if(getSearchedStudent()==null)
        {
            return "errorr";
        }
        else{
            return "searchsuccess";
        }
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * @return the searchedStudent
     */
    public Student getSearchedStudent() {
        return confirm;
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param searchedStudent the searchedStudent to set
     */
    public void setSearchedStudent(Student searchedStudent) {
        this.confirm = searchedStudent;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void Search(){        
        Studentservice s=new Studentservice();
        confirm=s.findStudent(sname, grade);      
   }

    /**
     * @return the lnane
     */
    public String getLnane() {
        return lname;
    }

    /**
     * @param lnane the lnane to set
     */
    public void setLnane(String lnane) {
        this.lname = lnane;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
