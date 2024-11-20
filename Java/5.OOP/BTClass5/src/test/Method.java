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
public class Method {
    public boolean isSoNguyenTo(int x){
        if (x <= 1) {
            
            return false;
        }

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public int timSoNguyenTo(int x){
        int count=0;
        while (count<1){
            x++;
            boolean condition=isSoNguyenTo(x);
            if (condition==true){
                System.out.println("Số nguyên tố tiếp theo là : "+x);
                count++;
            }
        }
        return x;
    }
}
