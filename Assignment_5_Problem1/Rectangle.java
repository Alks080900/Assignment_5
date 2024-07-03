package Assignment_5_Problem1;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height, String color){
    super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

}
