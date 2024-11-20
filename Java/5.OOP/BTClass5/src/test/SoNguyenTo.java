/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import test.Method;
/**
 *
 * @author Ngoc Lan
 */
public class SoNguyenTo {
    private int a;
    Method method=new Method();

    public SoNguyenTo() {
    }

    public SoNguyenTo(int a) {
        if(method.isSoNguyenTo(a)){
        this.a = a;
        } else {
            System.out.println(a+" không phải là số nguyên tố => 0 lưu");
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (method.isSoNguyenTo(a)){
        this.a = a;
        } else {
            System.out.println("Không set");
        }
        
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
    
    
    
}
