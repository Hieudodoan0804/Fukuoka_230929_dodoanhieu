package com.ra.web.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "student_id", nullable = false)
    private int studentId;
    @Basic
    @Column(name = "address", nullable = true, length = 255)
    private String address;
    @Basic
    @Column(name = "brithday", nullable = true)
    private Date brithday;
    @Basic
    @Column(name = "image_url", nullable = true, length = 255)
    private String imageUrl;
    @Basic
    @Column(name = "phone_number", nullable = true, length = 15)
    private String phoneNumber;
    @Basic
    @Column(name = "sex", nullable = true)
    private Boolean sex;
    @Basic
    @Column(name = "student_name", nullable = true, length = 100)
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        if (brithday != null ? !brithday.equals(student.brithday) : student.brithday != null) return false;
        if (imageUrl != null ? !imageUrl.equals(student.imageUrl) : student.imageUrl != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(student.phoneNumber) : student.phoneNumber != null) return false;
        if (sex != null ? !sex.equals(student.sex) : student.sex != null) return false;
        if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (brithday != null ? brithday.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        return result;
    }
}
