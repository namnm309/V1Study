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
public class Test {

    /*
        Sử dụng Regular Expression : https://codelearn.io/sharing/regular-expression-trong-java
    */
    public static void main(String[] args) {
        TamGiac tamgiac1=new TamGiac();
        tamgiac1.inputInfo();
        tamgiac1.loaiTamGiac();
        tamgiac1.tinhChuVi(tamgiac1.getA(),tamgiac1.getB(),tamgiac1.getC());
        tamgiac1.tinhDienTich(tamgiac1.getA(),tamgiac1.getB(),tamgiac1.getC());
    }
    
}
