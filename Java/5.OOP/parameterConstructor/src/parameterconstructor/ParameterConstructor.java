/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameterconstructor;

/**
 *
 * @author Ngoc Lan
 */
public class ParameterConstructor {
    private String name;
    private int age;
    private String kind;

    public ParameterConstructor() {
    }

    public ParameterConstructor(String name, int age, String kind) {
        this.name = "MinhNam";
        this.age = age;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    
    
 
    
    
}
