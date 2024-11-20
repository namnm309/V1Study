/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

import java.util.Scanner;

/**
 *
 * @author Ngoc Lan
 */
public class Main {

    public static void main(String[] args) {
        c1 obj1 = new c1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=========== Regular Expression ============");
            System.out.println("Mời bạn chọn các lựa chọn sau : ");
            System.out.println("1.Sử dụng String.matches(String) " + "\n"
                    + "String.matches(String) được dùng để kiểm tra chuỗi đầu vào có phù hợp với biểu thức regex hay không. Đây là cách thông dụng nhất.");
            System.out.println("2.Sử dụng lớp Pattern và Matcher" + "\n" + ""
                    + "Định dạng ngày tháng năm dd/mm/yyyy hoặc dd-mm-yyyy");
            System.out.println("3.Thoát ");
            System.out.println("===========================================");
            System.out.print("Mời bạn nhập : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj1.tech1();
                    break;
                case 2:
                    obj1.tech2();
                    break;
                case 3:
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
            }
        }
    }
}
