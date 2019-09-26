package com.ics95191.demo.Model;

public class Student {
    private long id;
    private int studentId;
    private String firstName;

    public Student(long id, int studentId, String firstName) {
        this.id = id;
        this.studentId = studentId;
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

