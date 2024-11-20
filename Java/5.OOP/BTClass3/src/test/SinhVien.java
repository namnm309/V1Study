/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Ngoc Lan
 */
public class SinhVien {
    private String masv;
    private double average;
    private int age;
    private String schoolroom;

    public SinhVien() {
        masv="Unknown";
        average=0;
        age=0;
        schoolroom="Unknown";
    }

    public SinhVien(String masv, double average, int age, String schoolroom) {
        this.masv = masv;
        this.average = average;
        this.age = age;
        this.schoolroom = schoolroom;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolroom() {
        return schoolroom;
    }

    public void setSchoolroom(String schoolroom) {
        this.schoolroom = schoolroom;
    }
    
    
}
