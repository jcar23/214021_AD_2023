package Shapes;

public class Triangle extends Shape {
    private Point b;
    private Point c;

    //constructor por omission
    public Triangle(){
        b = new Point();
        c =  new Point();
        // chama o contrutor de omissão do atributos
    }

    @Override
    public double getArea() {
        return (getHeight()* getWidth())/2;
    }

    @Override
    public double getPerimeter() {

        double width = this.getWidth();
        double height = this.getHeight();
        double hipo = c.distanceTo(b);
        double perimeter = hipo + width + hipo;
        return perimeter ;
    }

    //constructor por parameter
    public Triangle(Point a, Point b, Point c){
        position = a;
        this.b = b;
        this.c = c;
    }



    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public void setA(Point a) {
        this.position = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    // modificador, usar para mudar os trÊs pontos
    public void setABC (Point b, Point c){
        this.b = b;
        this.c = c;
    }
    public double getWidth() {
        return position.distanceTo(b);
    }
    public double  getHeight (){
        return position.distanceTo(c);
    }

    public double getTriangleArea(){
        // ((a.distanceTo(b)*a.distanceTo(c))/2)
        return (getHeight()* getWidth())/2;
    }

    @Override

    public String toString(){
        // chamar o position dos pontos
        return getClass().getSimpleName() + " - A: " + this.position.toString() + "B: " + this.b.toString() + "C: " + this.c.toString();
    }
}
