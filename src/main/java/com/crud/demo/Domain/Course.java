package com.crud.demo.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private int course_code;
    private String course_title;
    @ManyToOne
    @JsonBackReference
    private Semester semester;

    public Course() {
    }

    public Course(int course_code, String course_title) {
        this.course_code = course_code;
        this.course_title = course_title;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourse_code() {
        return course_code;
    }

    public void setCourse_code(int course_code) {
        this.course_code = course_code;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }
}
