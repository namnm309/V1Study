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
public class SinhVien {
    private boolean dk1;
    private boolean dk2;
    private boolean dk3;
    private boolean dk4;

    public SinhVien() {
    }

    public SinhVien(boolean dk1, boolean dk2, boolean dk3, boolean dk4) {
        this.dk1 = dk1;
        this.dk2 = dk2;
        this.dk3 = dk3;
        this.dk4 = dk4;
    }

    public boolean isDk1() {
        return dk1;
    }

    public void setDk1(boolean dk1) {
        this.dk1 = dk1;
    }

    public boolean isDk2() {
        return dk2;
    }

    public void setDk2(boolean dk2) {
        this.dk2 = dk2;
    }

    public boolean isDk3() {
        return dk3;
    }

    public void setDk3(boolean dk3) {
        this.dk3 = dk3;
    }

    public boolean isDk4() {
        return dk4;
    }

    public void setDk4(boolean dk4) {
        this.dk4 = dk4;
    }
    
    public void checkTong(){
        if (dk1==true && dk2==true && dk3==true && dk4==true) {
            System.out.println("Học viên đủ đều kiện ");
    } else {
            System.out.println("Học viên không đủ điều kiện ");
    }
}
}
