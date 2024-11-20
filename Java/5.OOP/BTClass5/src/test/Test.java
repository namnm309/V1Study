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
        Scanner sc=new Scanner(System.in);
        SoNguyenTo snt=new SoNguyenTo();
        Method snt1=new Method();
        System.out.println("Mời bạn nhập số : ");
        int a=sc.nextInt();
        if (snt1.isSoNguyenTo(a)){
            System.out.println("Là số nguyên tố ");
            System.out.println("================");
            snt1.timSoNguyenTo(a);
        } else {
            System.out.println("Ko phải số nguyên tố ");
        }
        System.out.println("===========================");
        
        snt.setA(a);
        
        
        
        
    }
    
}
