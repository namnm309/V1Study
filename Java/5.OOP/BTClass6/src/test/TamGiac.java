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
public class TamGiac {

    private int a;
    private int b;
    private int c;

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a : ");
        int a = sc.nextInt();
        setA(a);
        System.out.println("Nhập b : ");
        int b = sc.nextInt();
        setB(b);
        System.out.println("Nhập c : ");
        int c = sc.nextInt();
        setC(c);
    }

   // Phương thức xác định kiểu tam giác
    public void loaiTamGiac() {
        if (a == b && b == c) {
            System.out.println("Tam giác đều");
        } else if (a == b || b == c || a == c) {
            System.out.println("Tam giác cân");
        } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("Tam giác vuông");
        } else {
            System.out.println("Tam giác thường");
        }
    }

    // Phương thức tính chu vi tam giác
    public void tinhChuVi(int a,int b,int c) {
        int chuVi = a + b + c;
        System.out.println("Chu vi tam giác: " + chuVi);
    }

    // Phương thức tính diện tích tam giác theo công thức Heron
    public void tinhDienTich(int a,int b,int c) {
        double p = (a + b + c) / 2.0; // Nửa chu vi tam giác
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Công thức Heron
        System.out.println("Diện tích tam giác: " + dienTich);
    }
}
