/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btclass16;

/**
 *
 * @author Ngoc Lan
 */
public class FlashLamp {
    private boolean status;
    private Battery battery=new Battery();

    public FlashLamp() {
        this.status=false;//tắt 
        battery.setEnergy(0);//chưa có pin => năng lượng = 0         
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Battery getBattery() {
        battery.checkEnergy();
        return battery;
    }
    
    public void turnOn(){
        status=true;
        if (battery.getEnergy()>0){
            System.out.println("Đèn đang sáng");
            battery.decreaseEnergy();
        } else {
            System.out.println("Đèn ko sáng");
        }
    }
    
    public void turnOff(){
        status=false;
        System.out.println("Đèn đang tắt");
    }
    
    //Thêm hàm kiểm tra đèn đang bật hay tắt
    public void checkStatus(){
        if (status==true){
            System.out.println("Đèn hiện tại đang sáng");
        }else {
            System.out.println("Đèn hiện tại đang tắt");
        }
    }
    
    
    
}
