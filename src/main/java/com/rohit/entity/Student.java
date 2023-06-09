package com.rohit.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "orm_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String about;

//    @OneToOne(mappedBy = "student")
//    private Laptop laptop;

    public Student(int studentId, String studentName, String about, Laptop laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.about = about;
//        this.laptop = laptop;
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

//    public Laptop getLaptop() {
//        return laptop;
//    }

//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
}
