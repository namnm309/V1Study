/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import test.SinhVien;
/**
 *
 * @author Ngoc Lan
 */
public class Method {
    SinhVien temp=new SinhVien();
    
    public void inputInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("==========NHẬP THÔNG TIN=========");
        String masv=CheckNgoaiLe.checkMaSV("masv");
        double average=CheckNgoaiLe.checkDTB(0);
        int age=CheckNgoaiLe.checkAge(0);
        String lop=CheckNgoaiLe.checkLop("Lop");
        SinhVien sv1=new SinhVien(masv, average, age, lop);
        temp=sv1;
    }
    
    public void showInfo(){
        System.out.println("Thông tin của sinh viên là : ");
        System.out.println("Tên sinh viên : "+temp.getMasv());
        System.out.println("Điểm trung bình của sinh viên : "+temp.getAverage());
        System.out.println("Tuổi của sinh viên là : "+temp.getAge());
        System.out.println("Lớp của sinh viên : "+temp.getSchoolroom());
    }
    
    public void checkHocBong(){
        if (temp.getAverage()>=8.0){
            System.out.println("Sinh viên đủ điều kiện đạt học bổng !!!");
        } else {
            System.out.println("Sinh viên ko đủ điều kiện đậu học bổng !!!");
        }
    }
    
}
