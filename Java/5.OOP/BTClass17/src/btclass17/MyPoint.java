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
public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    this.x=0;
    this.y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //Phương thức set cho cả X và Y 
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    
    public double Distance(int x2,int y2){
    //Nhắc lại ct tính khoảng cách giữa 2 điểm : 
    //A(xA,yA) ,B(xB,yB)
    //=> kc giữa a và b là sqrt((xB-xA)^2+(yB-yA)^2)= độ dài AB 
        System.out.println("Khoảng cách giữa điểm này so với tọa độ x,y đã cho là :");
        return Math.sqrt(Math.pow((x2-getX()), 2)+Math.pow((y2-getY()), 2));    
    }
    
    //tải chồng phương thức 
    public double Distance(MyPoint toadokhac){
        return Math.sqrt(Math.pow((toadokhac.getX()-getX()), 2)+Math.pow((toadokhac.getY()-getY()), 2));
    }
    
    
    
    
    
    
    
    
}
