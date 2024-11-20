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
public class Person {
    private String name;
    private int age;
    private String id;

    public Person() {
    this.name="Unknown";
    this.age=0;
    this.id="Unknown";
    }

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập tên : ");
        name=sc.nextLine();
        
        System.out.println("Mời bạn nhập tuổi : ");
        //age=sc.nextInt();        
        //sc.nextLine();//nextInt() giống nextLine() khi chạy nếu ko có sc.nextLine() thì nó sẽ ko nhận enter (\n) 
        //Cách 2: 
        age=Integer.parseInt(sc.nextLine());
        
        System.out.println("Mời bạn nhập ID : ");
        id=sc.nextLine().trim();
    }
    
    public void showDisplay(){
        System.out.println("Tên của bạn là : "+name);
        System.out.println("Tuổi của bạn là : "+age);
        System.out.println("ID của bạn là : "+id);
    }
    
    
}
