/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentdetails.std;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author logarajah
 */
public class Studentservice {
    private static final List<Student> students;
    public Studentservice() {
    }
    static
    {
        Student s1 = new Student("Ravi", "1", "Suntharam", "Vanni");
        Student s2 = new Student("Loga", "6", "Sutha", "Vanni");
        Student s3 = new Student("Kuna", "8", "Ravinthar", "Jaffna");
        Student s4 = new Student("Mani", "10", "Vimal", "Vavuniya");
        Student s5 = new Student("Thenu", "11", "Thabo", "Jaffna");
        students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        
    }
     public static List<Student> getStudents() {
        return students;
    }
    public Student findStudent(String sname,String grade){
        Student st=null;
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getFirstname().equals(sname) && students.get(i).getGrade().equals(grade))
            {
                st=(Student) students.get(i);
            }
        }
        return st;
    }

    

    
}
