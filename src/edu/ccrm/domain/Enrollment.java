package edu.ccrm.domain;

import java.time.LocalDate;



public class Enrollment

{
    private Student  Studentss  ;
    private Course   courses ;



    
    private LocalDate enrollment_date;


    private Grade   grade ;

    public Enrollment(Student Studentss, Course courses)
    {
        this.Studentss =   Studentss;

        this.courses =  courses;


        this.enrollment_date   = LocalDate.now();
        this.grade  = Grade.F ; // Not graded yet
    }

    public Student getStudent() { return Studentss; }


    public Course getCourse()   { return courses ; }
    public LocalDate getEnrollmentDate() { return enrollment_date; }


    public Grade getGrade() { return grade; }

    public void setGrade(Grade grade) { this.grade   = grade ; }
}
