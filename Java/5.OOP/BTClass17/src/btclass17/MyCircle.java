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
public class MyCircle {
    private MyPoint tam;
    private MyPoint tam2;
    private int bankinh;
       
    public MyCircle(int bankinh) {        
        this.bankinh = bankinh;
    }

    public MyCircle(MyPoint tam, MyPoint tam2) {
        this.bankinh=(int) Math.sqrt(Math.pow((tam2.getX()-tam.getX()),2)+Math.pow((tam2.getY()-tam.getY()),2));
        
    }
    

    public MyPoint getTam() {
        return tam;
    }

    public void setTam(MyPoint tam) {
        this.tam = tam;
    }

    public int getBankinh() {
        return bankinh;
    }

    public void setBankinh(int bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public String toString() {
        return "Hình tròn @("+tam.getX()+","+tam.getY()+") bán kính r="+bankinh;
    }
    
    public double getArea(){
        return Math.PI*bankinh*bankinh;
    }
    
    

    
    
    
}
