package pt.uma.tpsi.arqd.vehicles;
import pt.uma.tpsi.arqd.shapes.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle vh = new Car();

        Car c2 = new Car( 1977, "Ford", "Ranger",10000 , "Black", 5);

        System.out.println(c2.toString());
        Car c3 = new Car();
        System.out.println(c3.toString());
        c2.drive();
        System.out.println(c2.toString());

        Triangle tr = new Triangle(new Point(1,3), new Point(4,6), new Point(4,2));
        Figure figure = new Figure();
        figure.add(tr); // adding a new shape to figure;


        Rectangle rt = new Rectangle(new Point(0,0), 6 ,8);
        figure.add(rt);

        // class Shape, e nome
        for (Shape shape : figure.getShapes()){
            double area = shape.getArea();
            double perimeter = shape.getPerimeter();

            System.out.println(shape.toString());
            System.out.println("\t Area: " + area + ", perimeter: " + perimeter);
        };


        // this is a copy from another main;

        ArrayList<Point> arrayList2 = new ArrayList<Point>();

        Point p1 = new Point();

        arrayList2.add(p1);
        arrayList2.add(new Point());
        arrayList2.add(new Point(9,7));
        arrayList2.add(new Point(10,10));
        arrayList2.add(new Point(6,4));

        System.out.println(arrayList2.toString());

        // ordenado da forma crescente // decrescente;
        Collections.sort(arrayList2);
        System.out.println(arrayList2.toString());
        //System.out.println(arrayList2.stream().sorted());
        Collections.sort(arrayList2);


        /// usando o comparator depois de ter feito uma class;

        Collections.sort(arrayList2, new PointComparator()); // oredenar essa lista usando o new PointComparator / comparador;
        System.out.println(arrayList2);

        // saber usar array list
        // linkedlist
        // map
        // stack
        // vector  -- é parecido com um array

        //

    }
}