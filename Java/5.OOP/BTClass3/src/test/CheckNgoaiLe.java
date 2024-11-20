/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;
import java.util.Scanner;
import java.lang.String;


/**
 *
 * @author Ngoc Lan
 */
public class CheckNgoaiLe {
   public static final Scanner sc=new Scanner(System.in);//Phải có public static final 
    
    
    public static String checkMaSV(String masv){//các phương thức phải có static 
        boolean condition=false;
        while (true) {
            System.out.println("Mời bạn nhập Mã Sinh Viên : ");
            masv=sc.nextLine();
        if (masv.length()==8){
            
            condition=true;
            return masv;
        } else {
            System.out.println("Mã Sinh Viên phải có chứa 8 kí tự ");
        }
        }
    }
    
    public static double checkDTB(double average){//các phương thức phải có static
        boolean condition=false;
        while (true){
            System.out.println("Mời bạn nhập điểm trung bình : ");
            average=sc.nextDouble();
            if (average>=0 && average<=10){
                condition=true;
                return average;
            } else {
                System.out.println("Điểm trung bình phải từ 0.0 đến 10.0 ");
            }
        }
    }
    
    public static int checkAge(int age){//các phương thức phải có static
        boolean condition=false;
        while (true){
            System.out.println("Mời bạn nhập tuổi : ");
            age=sc.nextInt();
            sc.nextLine();
            if (age>=18 && age<=100){
                condition=true;
                return age;
            } else {
                System.out.println("Tuổi phài từ 18 đến 100");
            }
        }
    }
    
    public static String checkLop(String lop){//các phương thức phải có static
    boolean condition=false;
    
    while(true) {
        System.out.println("Mời bạn nhập lớp : ");
        lop=sc.nextLine();
        if (lop.charAt(0)=='A' || lop.charAt(0)=='C'){
            condition=true;
            return lop;
        } else {
            System.out.println("Tên lớp phải bắt đầu bằng A hoặc C");
    }
        
    }
}
}
