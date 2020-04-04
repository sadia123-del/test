package com.crud.demo.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(mappedBy = "semester")
    @JsonBackReference
    private List<Student> students;

    @OneToMany(mappedBy = "semester")

    private List<Course> courses;
    public Semester() {
    }

    public Semester(String semester_no) {
        this.semester_no = semester_no;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemester_no() {
        return semester_no;
    }

    public void setSemester_no(String semester_no) {
        this.semester_no = semester_no;
    }

    private String semester_no;
}
