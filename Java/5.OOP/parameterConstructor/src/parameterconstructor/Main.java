/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameterconstructor;

import java.util.Scanner;

/**
 *
 * @author Ngoc Lan
 */
public class Main {
         public static void main(String[] args) {
         ParameterConstructor obj1=new ParameterConstructor("Nam", 12, "Student");
             System.out.println("Mời bạn nhập tên của bạn vào : ");
             Scanner sc=new Scanner(System.in);
             String name=sc.nextLine();
             obj1.setName(name);
             System.out.println("My name is : "+obj1.getName());
             System.out.println("My age is : "+obj1.getAge());
             System.out.println("My job is : "+obj1.getKind());
         
         }
}
