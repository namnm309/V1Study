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
        Class obj1=new Class();
        obj1.inputInfo();
        obj1.printInfro();
        obj1.addition();
        obj1.subtract();
        obj1.division();
        obj1.multi();
        System.out.println("");
        System.out.print("====================================");
        System.out.println("");
        Class obj2=new Class();
        obj2.setNumber1(1);
        obj2.printInfro();
        System.out.println("");
        Class obj3=new Class();
        obj3.printInfro();
        
    }
    
}
