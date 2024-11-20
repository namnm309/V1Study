/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import test.Check;
/**
 *
 * @author Ngoc Lan
 */
public class Test {

    /*
        Sử dụng Regular Expression : https://codelearn.io/sharing/regular-expression-trong-java
    */
    public static void main(String[] args) {
        SinhVien sv1=new SinhVien();
        Check check=new Check();
        System.out.println("Mời bạn check các điều kiện sau :");
        boolean dk1=check.checkDK1("true");
        boolean dk2=check.checkDK2(0);
        boolean dk3=check.checkDK3("");
        boolean dk4=check.checkDK4("");
        
        sv1=new SinhVien(dk1, dk2, dk3, dk4);
        sv1.checkTong();
        
        
        
        
        
    }
    
}
