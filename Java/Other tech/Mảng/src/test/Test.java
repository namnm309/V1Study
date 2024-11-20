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

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Mảng 
        //Khai báo : 
            //Cách 1: kiểu_dữ_liệu [] tên_mảng;
            String [] mang1;//lúc này chưa cấp phát bộ nhớ cho mảng 
            
            //Cách 2: kiểu_dữ_liệu tên_mảng [];
            String mang2[];//lúc này chưa cấp phát bộ nhớ cho mảng 
            
        //Mảng là 1 đối tượng nên chỉ cấp phát bộ nhớ khi mảng có thể hiện 
        //nghĩa là chỉ cấp phát bộ nhớ khi có đối tượng truyền vào mảng 
             String [] mang3 =new String[5];
            
        //Vì mảng là 1 nơi để lưu trữ các đối tượng 
        //Có 2 cách để nhập giá trị vào cho mảng 
        //Cách 1 : khởi tạo sao khi tạo mảng 
            int mangso []=new int[5];
            mangso[0]=0;
            mangso[1]=1;
            mangso[2]=2;
            mangso[3]=3;
            mangso[4]=4;
            //mangso[5]=5; sẽ báo lỗi ArrayIndexOutOfBoundsException
            
        for (int i=0;i<=4;i++){
//Nếu là 5 sẽ báo lỗi : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
            System.out.println("Vị trí thứ "+i+"của mảng có giá trị là :"+mangso[i]);
        }
            
        //Tạo kiểu nhập liệu cho mảng 
        System.out.println("Mời bạn nhập số phần tử muốn tạo cho mảng : ");
        int ptu=sc.nextInt();
        sc.nextLine();
        String mangusernhap[]=new String[ptu];
        
        //Nhập liệu = vòng for 
       for (int i=0; i<mangusernhap.length;i++ ){
           System.out.println("Mời bạn nhập liệu giá trị cho phần tử thứ "+i+" của mảng : ");
           mangusernhap[i]=sc.nextLine();
       }
    
        //in ra giá trị của mảng bằng vòng for 
        for (String inra : mangusernhap){            
            System.out.println("Giá trị phần tử của mảng là : ");
            System.out.println(inra);
            
        }
       
    
}
}
