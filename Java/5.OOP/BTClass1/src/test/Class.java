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
public class Class {
    private int number1;
    private int number2;

    public Class() {
    }

    public Class(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    
    public void inputInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Mời bạn nhập số thứ nhât : ");
        number1=sc.nextInt();
        System.out.print("Mời bạn nhập số thứ hai : ");
        number2=sc.nextInt();
    }
    
    public void printInfro(){
        System.out.println("Số thứ nhất là : "+number1);
        System.out.println("Số thứ hai là : "+number2);
    }
    
    public int addition(){
        System.out.println("Phép + là : ");
        return number1+number2;
    }
    
    public int subtract(){
        System.out.println("Phép trừ là : ");
        return number1-number2;
    }
    
    public int multi(){
        System.out.println("Phép nhân là : ");
        return number1*number2;
    }
    
    public int division(){
        System.out.println("Phép chia là : ");
        return number1/number2;
    }
    
    
}
