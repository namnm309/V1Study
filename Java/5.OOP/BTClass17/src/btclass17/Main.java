/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btclass17;

/**
 *
 * @author Ngoc Lan
 */
public class Main {

    public static void main(String[] args) {
//bla bla bla
// Chương trình kiểm thử:
        MyPoint p1 = new MyPoint(3, 2);
        MyPoint p2 = new MyPoint(2, 4);

// Kiểm thử việc tải chồng phương thứcdistance():
        System.out.println(p1.Distance(p2));
        System.out.println(p1.Distance(5, 6));
        
//Test MyCircle 
        MyCircle obj1=new MyCircle(5);
        MyCircle obj2=new MyCircle(p1, p2);
        System.out.println("Nhập bán kính sẵn có diện tích là : "+obj1.getArea());
        System.out.println("Nhập 2 điểm sẵn có diện tích là : "+obj2.getArea());
    }

}
