package Assignment_5_Problem1;

import Assignment_3Problem3.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(3.5, 4.6, "Red");
        shapes[1] = new Circle(10.8, "Blue");
        shapes[2] = new Square(2.1, "Purple");
        shapes[3] = new Rectangle(3.6, 7.3, "Green");
        shapes[4] = new Rectangle(6.7, 7.9, "Pink");

        printTotal(shapes);
    }

        public static void printTotal (Shape[] shapes){
            double perimeterTotal = 0.0;
            double areaTotal = 0.0;
            for (Shape shape : shapes) {
                perimeterTotal+=shape.calculatePerimeter();
                areaTotal+=shape.calculateArea();
            }
            System.out.println("The total area is: " + Math.round(areaTotal));
            System.out.println("The total perimeter is: " + Math.round(perimeterTotal));
        }
}