public class Main {
        public static void main(String[] args) {
            // por parametros
            Point p0 = new Point(1,1);
            // omissão
            //Point p = new Point();
            Point p1 = new Point();
            Point p2 = new Point(3,1);
            double distance = p0.distanceTo(p2);
            System.out.println(distance);

            // constructors
            Triangle tr = new Triangle();
                        // usando os três pointos da classe anterior;
            Triangle tr1 = new Triangle(p0,p1,p2);
            Triangle tr2 = new Triangle(new Point(2,5), new Point(3,0), new Point(2,3));

            //modifier
            tr.setA(new Point(10,10));

            //selector
            Point b = tr2.getB();
            int x = (int) tr2.getC().getX();

            tr1.setABC(new Point(2,2), p0,b);
            double base = tr1.getWidth();
            System.out.println(base);
            double height = tr2.getHeight();
            System.out.println(height);
            double area = tr2.getTriangleArea();
            System.out.println(area);


            Point p = new Point (2, 2);
            p.setX(4);
            p.setY(7);
            Rectangle r1 = new Rectangle();
            Rectangle rect = new Rectangle(new Point(0,3),3,5);
            Rectangle r3 = new Rectangle(new Point() , 3,5);

            double rectanglePerimeter = r1.perimeter(3,5);
            System.out.println("Perimeter: " + rectanglePerimeter);

            double rectangleArea = r1.areaOfRectangle(3,5);
            System.out.println(rectangleArea + "area");

            Boolean contains = rect.containsPoint(p);
            System.out.println(contains);


            //double va = r1.getHeight();

    }
}