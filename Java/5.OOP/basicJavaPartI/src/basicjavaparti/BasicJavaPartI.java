/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaparti;

import java.util.Scanner;

/**
 *
 * @author Ngoc Lan
 */
public class BasicJavaPartI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //1.
            //System.out.println("Hello w3resource ! ");
        
        //2.
            //System.out.println("74+36="+(74+36));
        
        //3.
            //System.out.println("50/3= "+(50/3));
    
        //4.
//            System.out.println("a.-5+9*6= "+(-5+8*6));
//            System.out.println("b.(55+9)%9= "+((55+9)%9));
//            System.out.println("c.20+(-3*5/8)= "+(20+(-3*5/8)));
//            System.out.println("d.5+15/3*2-8%3= "+(5+15/3*2-8%3));

        //5. 
//            System.out.print("Mời bạn nhập số đầu tiên : "); int a=sc.nextInt();
//            System.out.print("Mời bạn nhập số thứ 2 : "); int b=sc.nextInt();
//            System.out.println("Tổng của "+a+" và "+b+" là : "+(a+b));

        //6.
//            System.out.println("Mời bạn nhấp số a : "); int a=sc.nextInt();
//            System.out.println("Mời bạn nhập số b : "); int b=sc.nextInt();
//            System.out.print(a+" + "+b+" = "+(a+b)+"\n"
//            + a+" - "+b+" = "+(a-b)+"\n"
//                    + a+" x "+b+" = "+(a*b)+"\n"
//                            + a+" /"+b+" = "+(a/b)+"\n"
//                                    + a+" mod "+b+" = "+(a%b)+" \n");

        //7.
//                System.out.println("Mời bạn nhập 1 số : "); int a=sc.nextInt();
//                for (int i=1;i<=10;i++){
//                    System.out.println(a+" x "+i+" = "+(a*i));
//                }

        //8. swap 
//                System.out.println("Mời bạn nhập vào số a :"); int a=sc.nextInt();
//                System.out.println("Mời bạn nhập vào số b :"); int b=sc.nextInt();
//                System.out.println("Sau khi swap số a và b là : ");
//                int temp=b;
//                b=a;
//                a=temp;
//                System.out.print("a là : "+a+" và b là : "+b+"\n");

        //9.add two binary numbers => solution : https://www.w3resource.com/java-exercises/basic/java-basic-exercise-17.php
//                  //Vì số binary là số dạng 0 và 1 và rất dài => dùng kiểu dữ liệu long 
//                  long binary1, binary2 ;
//                  //khai báo chỉ mục index ( i ) và 1 số dư (remainder)
//                  int i=0, remainder=0;
//                  
//                  //Tạo mảng để lưu trữ tổng các  chữ số nhị phân 
//                  int [] sum=new int[20];
//                  
//                  //Nhập số binary thứ nhất và thứ hai : 
//                  System.out.println("Mời bạn nhập số nhị phân đầu tiên ");  binary1=sc.nextLong();
//                  System.out.println("Mời bạn nhập số nhị phân thứ hai "); binary2=sc.nextLong();
//                  
//                  //Vòng lặp chạy liên tục đến khi cả hai số nhị phân = 0 ,khi 1 số khác 0 và 1 số = 0 thì vòng lặp vẫn chạy  
//                  while(binary1 != 0 || binary2 != 0)
//                  {
//                      sum[i++]=(int)((binary1 % 10 + binary2 % 10 + remainder ) % 2);//+ hai số cuối của binary1 lại và lưu vào index tăng dần của sum , nếu 0 chia hết cho 2 
//                      remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);//nếu  hai số trên + lại chia hết cho 2 thì cho dư 1  vào remainder để + trong bit tiếp theo 
//                      binary1 = binary1/10; //giảm bớt 1 bit đã tính 
//                      binary2 = binary2/10; // giảm bớt 1 bit đã tính 
//                      
//                  }
//                  
//                  //Nếu còn số dư thì + vào tổng 
//                  if (remainder != 0){
//                      sum[i++]=remainder;
//                  }
//                  
//                  //Giảm chỉ số i để in 
//                  --i;
//                  
//                  //Hiển thị tổng của 2 số 
//                  System.out.println("Tổng của 2 số binary trên là : ");
//                  while(i >= 0) {
//                      System.out.print(sum[i--]+" ");
//                  }
//                  System.out.println("");
        
                  
                
            
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
