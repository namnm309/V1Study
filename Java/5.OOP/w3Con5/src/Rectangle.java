public class Rectangle {
    private double length;
    private double width;

    public Rectangle (double length,double width){
        this.length=length;
        this.width=width;
    }

    public Rectangle(Rectangle rectangle){
        this.length=rectangle.length;
        this.width=rectangle.length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    
}
