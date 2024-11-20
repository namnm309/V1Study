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
public class Main {

    public static void main(String[] args) {

        Battery obj1 = new Battery();
        FlashLamp obj2 = new FlashLamp();
        //Lắp pin cho đèn 
        System.out.println("Đã lắp pin");
        obj1.setEnergy(8);
        obj2.setBattery(obj1);
        System.out.println("=============================");

        //Bật và tắt đèn pin 10 lần 
        System.out.print("Bật đèn -"); obj2.turnOn();
        System.out.print("Tắt đèn -"); obj2.turnOff();
        
//        System.out.print("Bật đèn "); obj2.turnOn();
//        System.out.print("Tắt đèn "); obj2.turnOff();
//        
//        System.out.print("Bật đèn "); obj2.turnOn();
//        System.out.print("Tắt đèn "); obj2.turnOff();
//        
//        System.out.print("Bật đèn "); obj2.turnOn();
//        System.out.print("Tắt đèn "); obj2.turnOff();
//        
//        System.out.print("Bật đèn "); obj2.turnOn();
//        System.out.print("Tắt đèn "); obj2.turnOff();

        //In ra năng lượng còn lại 
        System.out.println("============================================");
        obj2.getBattery();

        //Kiểm tra đèn đang bật hay tắt 
        obj2.checkStatus();
    }
}
