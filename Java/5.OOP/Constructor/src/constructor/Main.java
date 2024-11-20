/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

import java.util.Scanner;

/**
 *
 * @author Ngoc Lan
 */
public class Main {
     public static void main(String[] args) {
         
         System.out.println("Mời bạn nhập thông tin người thứ nhất : ");
         Scanner in=new Scanner(System.in);
         String name=in.nextLine();                 
         String id=in.nextLine();
         int age=in.nextInt();
        Constructor ng1=new Constructor(name, age, id);
         System.out.println(ng1.toString());
         
         System.out.println("Mời bạn nhập thông tin người thứ hai : ");
         String name2=in.nextLine();
         String id2=in.nextLine();
         int age2=in.nextInt();
         Constructor ng2=new Constructor(name2, age2, id2);
         
        //Tạo 1 phương thức cho phép nhập 
         
    }
}
