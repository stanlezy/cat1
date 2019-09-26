package com.ics95191.demo.Model;

public class Matches {
    private long studentId;
    private boolean MALE;
    private boolean Female;

    public Matches(long studentId, boolean MALE, boolean female) {
        this.studentId = studentId;
        this.MALE = MALE;
        Female = female;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public boolean isMALE() {
        return MALE;
    }

    public void setMALE(boolean MALE) {
        this.MALE = MALE;
    }

    public boolean isFemale() {
        return Female;
    }

    public void setFemale(boolean female) {
        Female = female;
    }

    @Override
    public String toString() {
        return "Matches{" +
                "studentId=" + studentId +
                ", MALE=" + MALE +
                ", Female=" + Female +
                '}';
    }
}

