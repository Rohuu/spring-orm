package com.example.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "jpa_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne(mappedBy = "student")
    // this means that only make foreign key in database to manage student which is inside laptop
    // so no foreign key table will be made in student
    private Laptop laptop;
    // hibernate will make a foreign key of laptop in student table
    // here student has a laptop but in laptop class we have no student
    // which means by student we can access laptop but by laptop we can't access student
    // this is called unidirectional mapping
    // to make it bidirectional we have to inject student dependency to laptop as well


    public Student(int studentId, String studentName, String about, Laptop laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.about = about;
        this.laptop = laptop;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
