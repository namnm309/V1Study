/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Ngoc Lan
 */
public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int hourwork;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String address, double salary, int hourwork) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.hourwork = hourwork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        if(this.salary>=200){
            return salary*0.2;
        } else if (this.salary<200 && this.salary>=100) {
            return salary*0.1;
        }else {
        return salary;
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHourwork() {
        return hourwork;
    }

    public void setHourwork(int hourwork) {
        this.hourwork = hourwork;
    }
    
    public void inputInfro(){
        Scanner sc=new Scanner(System.in);
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN");
        System.out.print("Mời bạn nhập tên nhân viên : ");
        name=sc.nextLine();
        System.out.print("Mời bạn nhập tuổi của nhân viên : "); age=sc.nextInt(); sc.nextLine();
        System.out.print("Mời bạn nhập địa chỉ của nhân viên : "); address=sc.nextLine();
        System.out.print("Mời bạn nhập tiền lương của nhân viên : "); salary=sc.nextDouble();
        System.out.print("Mời bạn nhập tổng số giờ làm của nhân viên : "); hourwork=sc.nextInt();
    }
    
    public void printInfo(){
        System.out.println("Tất cả thông tin của nhân viên là : ");
        System.out.println("Tên: "+name+"\n"
                         +  "Tuổi: "+age+"\n"
                         + "Địa chỉ: "+address+"\n"
                         + "Tiền lương: "+salary+"\n"
                         + "Tổng số giờ làm: "+hourwork+"\n");
        System.out.println("Lương thưởng là : "+getSalary());
    }
    
    
}
