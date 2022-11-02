public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    //constructor por omission
    public Triangle(){
        a = new Point();
        b = new Point();
        c =  new Point();
        // chama o contrutor de omissão do atributos
    }

    //constructor por parameter
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    // modificador, usar para mudar os trÊs pontos
    public void setABC (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getWidth() {
        return a.distanceTo(b);
    }
    public double  getHeight (){
        return a.distanceTo(c);
    }
    public double getTriangleArea(){
        // ((a.distanceTo(b)*a.distanceTo(c))/2)
        return (getHeight()* getWidth())/2;
    }

}
