public class Cat {
    private String name;
    private int age;

    Cat (){
        this.name="Unknown";
        this.age=0;
    }

    

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    void display(){
        System.out.println("Tên của con mèo là : "+getName()+"\n"+"Tuổi của con mèo là : "+getAge());
    }
}
