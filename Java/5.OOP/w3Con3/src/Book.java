public class Book {
    private String title;
    private String author;
    private int price;
     
    Book(){
        this.author="Unknown";
        this.title="Unknown";
        this.price=0;
    } 

    Book (String title, String author){
        this.title=title;
        this.author=author;
    }

    Book(String title,String author,int price){
        this(title,author);
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    void display(){
        System.out.println("Thông tin là : "+getAuthor()+"\n"+getTitle()+"\n"+getPrice());
    }
    

    
}