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
public class Battery {

    private int energy;

    public Battery() {
        this.energy = 10;
    }

    public void setEnergy(int energy) {//sạc pin
        this.energy = energy;
    }

    public int getEnergy() {
        //System.out.println("Năng lượng hiện tại là : " + energy);
        return energy;
    }

    public void decreaseEnergy() {//mỗi lần sử dụng sẽ giảm đi 2
        energy = energy - 2;
    }

    public void checkEnergy(){
        System.out.println("Năng lượng hiện tại là : "+energy);
    }
}
