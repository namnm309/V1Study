/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleconstructor;

import java.util.Scanner;

/**
 *
 * @author Ngoc Lan
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book book1=new Book();
         System.out.println("Thông tin của book1 như sau :"+"\n"+book1.getAuthor());
         System.out.println(book1.getTitle());
         System.out.println(book1.getPrice());
         
        System.out.println("Mời bạn nhập tên và tác giả của book2 : ");
        String title=sc.nextLine();
        
        String author=sc.nextLine();
        Book book2=new Book(title, author);
        book2.setTitle(title);
            System.out.println("Thông tin của book1 như sau :"+book2.getAuthor());
            System.out.println(book2.getTitle());
            System.out.println(book2.getPrice());
         
        System.out.println("Mời bạn nhập thông tin của book3 : ");
            System.out.println("Mời bạn nhập tên book3 :");
            String title3=sc.nextLine();
            System.out.println("Mời bạn nhập tên tác giả book3: ");
            String author3=sc.nextLine();
            System.out.println("Mời bạn nhập giá tiền book3");
            int price3=sc.nextInt();
            Book book3=new Book(title3, author3, price3);
                System.out.println("Thông tin của book1 như sau :"+book3.getAuthor());
                System.out.println(book3.getTitle());
                System.out.println(book3.getPrice());
         
        
    }
}
