/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btclass18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ngoc Lan
 */
public class Shop {
    Scanner sc=new Scanner(System.in);
    //Khai báo 1 mảng ArrayList để lưu danh sách các sản phẩm 
    ArrayList<Productt> product=new ArrayList<>();
    
    //Biến trung gian 
    Productt temp=new Productt();
    
    public void addProduct(){
        
        
        System.out.println("Mời bạn nhập thông tin của sản phẩm ");
        System.out.println("Mời bạn nhập tên sản phẩm : "); 
        String ten=sc.nextLine();
        System.out.println("Mời bạn nhập mô tả sản phẩm : ");
        String mota=sc.nextLine();
        System.out.println("Mời bạn nhập giá tiền sp : ");
        int giatien=sc.nextInt();
        sc.nextLine();
        System.out.println("Mời bạn nhập đánh giá sp 1-5 sao : ");
        int danhgia=sc.nextInt();
        sc.nextLine();
        
        Productt products=new Productt(ten, mota, giatien, danhgia);
        temp=products;
        //Nhập giá trị vào mảng 
        product.add(products);       
        
    }
    
    public void removeProduct(){
        System.out.println("Mời bạn nhập tên sản phẩm để tìm kiếm ");
        String tensptimkiem=sc.nextLine();
        //Xóa tên khỏi mảng 
        if (temp.getName().equals(tensptimkiem)){
        product.remove(temp.getName().equals(tensptimkiem));   
    } else {
            System.out.println("Không có tên hợp lệ !!!");
        }
}
        public void iterateProductList() {
        for (Productt product : product) {
            product.viewInfo();
            System.out.println("Số sao được đánh giá là : " + product.getRate() + "\n");
        }
    }
    
    public void searchProduct(int min, int max) {
        for (Productt product : product) {
            if (product.getPrice() >= min && product.getPrice() <= max) {
                product.viewInfo();
            }
        }
    }

        public void sortProduct() {
        product.sort((p1, p2) -> Integer.compare(p1.getPrice(), p2.getPrice()));
    }
}
