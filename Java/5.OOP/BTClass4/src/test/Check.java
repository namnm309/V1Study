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
public class Check {
    Scanner sc=new Scanner(System.in);
    
    public boolean checkDK1(String dk1){
        System.out.println("Là học viên đăng ký khóa học HDSE :");
        dk1=sc.nextLine();
        if (dk1.charAt(0)=='Y'||dk1=="Yes"){
            return true;
        } else {
        return false;
    }
    }
    
    public boolean checkDK2(double dk2){
        System.out.println("Có điểm tổng kết >= 75%");
        System.out.println("Mời bạn nhập điểm tổng kết : ");
        dk2=sc.nextDouble();
        sc.nextLine();
        if (dk2>=(75/100)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean checkDK3(String dk3){
        System.out.println("Không vi phạm nội quy trung tâm:");
        dk3=sc.nextLine();
        if (dk3.charAt(0)=='Y'||dk3=="Yes"){
            return true;
        } else {
        return false;
    }
    }
    
    public boolean checkDK4(String dk4){
        System.out.println("Các kì thi chỉ thi lần đầu :");
        dk4=sc.nextLine();
        if (dk4.charAt(0)=='Y'||dk4=="Yes"){
            return true;
        } else {
        return false;
    }
    }
    }

