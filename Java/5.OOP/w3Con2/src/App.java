import java.util.Scanner;

public class App {//https://www.w3resource.com/java-exercises/constructor/java-constructor-exercise-2.php
    //Đề bài : 
    /*
    Parameterized Constructor:
        -Write a Java program to create a class called Dog with instance variables name and color. 
        -Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. 
        -Print the values of the variables.    
    */ 
    public static void main(String[] args) throws Exception {
         final  Scanner input=new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin cho tên chó và màu sắc : ");
        System.out.print("Tên : "); String name=input.nextLine(); System.out.println("");
        System.out.print("Màu sắc : "); String color=input.nextLine(); System.out.println("");
        
        Dog dog1=new Dog(name, color);
        dog1.display();
    }
}
