/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Ngoc Lan
 */
public class Constructor {
    //Tác dụng của constructtor là 1 special method dùng để khởi tạo 1 object 
    //Thường dùng đề set giá trị ban đầu cho object có kiểu dữ liệu tương ứng 
    //Có 3 kiểu constructor : ko tạo tự động jvm sẽ tạo , có tham số và ko tham số 
    
    private String name;
    private int age;
    private String id;

    public Constructor() {
    }

    public Constructor(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

  

    

   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
     @Override
    public String toString() {
        return "Tên : "+getName()+" Tuổi: "+getAge()+" Mã số : "+getId();
    }
}
