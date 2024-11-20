/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btclass18;

/**
 *
 * @author Ngoc Lan
 */
public class Productt {
    private String name;
    private String description;
    private double price;
    private int rate;

    public Productt() {
    }

    public Productt(String name, String description, double price, int rate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.rate = rate;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    public void viewInfo(){
        System.out.println("Thông tin sản phẩm của bạn là : ");
        System.out.println("Tên SP : "+getName()+""
                + "Mô Tả SP : "+getDescription()+""
                        + "Giá Tiền SP : "+getPrice()+""
                                + "Đánh Giá SP : "+getRate());
    }
}
