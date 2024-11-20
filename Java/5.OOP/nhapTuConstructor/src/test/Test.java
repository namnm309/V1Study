/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Ngoc Lan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person ng1=new Person();
        ng1.showDisplay();
        System.out.println("======================");
        ng1.Input();
        ng1.showDisplay();
        Person ng2=new Person();
        ng2.showDisplay();
        System.out.println("======================");
        ng2.Input();
        ng2.showDisplay();
        ng1.showDisplay();
    }
    
}
