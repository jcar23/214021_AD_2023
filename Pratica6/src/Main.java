import Vehicles.*;
import Shapes.*;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle v1 = new Car();
        Car c2 = new Car(4,1996,2.500,"Civic","Honda","Black");
        System.out.println(c2.toString());


        ////////////////////////////////////////////////////////7

        Triangle triangle1 = new Triangle(new Point(5,6),new Point(3,4),new Point(1,2));
        System.out.println(triangle1 + "\n");
        Figure figure1 = new Figure();
        figure1.add(triangle1);


        Rectangle rectangle1 = new Rectangle(new Point(6,9), 3.5, 5.1);
        Figure figure2 = new Figure();
        figure2.add(rectangle1);
        System.out.println(rectangle1);

        for (Shape shape: figure1.getShapes()) {
            double area = shape.getArea();
            double perimeter = shape.getPerimeter();

            System.out.println(shape.toString());
            System.out.println("\t Area: " + area + ", perimeter: " + perimeter);;
        }


    }
}