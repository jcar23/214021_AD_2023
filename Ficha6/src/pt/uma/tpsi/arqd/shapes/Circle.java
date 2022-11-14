package pt.uma.tpsi.arqd.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(){
        this.radius = 0.0;
    }

    public Circle(double radius ){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

}
