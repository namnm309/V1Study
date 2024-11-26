public class Dog {
    private String name;
    private String color;

    Dog (String name,String color){
        this.name=name;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    void display(){
        System.out.println("Tên con chó là : "+getName());
        System.out.println("Màu sắc con chó là : "+getColor());
    }
}
