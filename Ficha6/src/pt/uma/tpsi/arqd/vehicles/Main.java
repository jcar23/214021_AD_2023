package pt.uma.tpsi.arqd.vehicles;
import pt.uma.tpsi.arqd.shapes.*;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle vh = new Car();

        Car c2 = new Car( 1977, "Modeo", "Ford",10000 , "Black", 5);

        System.out.println(c2.toString());
        Car c3 = new Car();
        System.out.println(c3.toString());
        c2.drive();
        System.out.println(c2.toString());

        Triangle tr = new Triangle(new Point(1,3), new Point(4,6), new Point(4,2));
        Figure figure = new Figure();
        figure.add(tr); // adding a new shape to figure;

        int x = 0;

        Rectangle rt = new Rectangle(new Point(0,0), 6 ,8);
        figure.add(rt);

        // class Shape, e nome
        for (Shape shape : figure.getShapes()){
            double area = shape.getArea();
            double perimeter = shape.getPerimeter();

            System.out.println(shape.toString());
            System.out.println("\t Area: " + area + ", perimeter: " + perimeter);
        };

    }
}