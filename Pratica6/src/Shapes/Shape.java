package Shapes;

public abstract class Shape {
    protected Point position;
    public Shape (){
        this.setPosition(new Point());
    }

    public Shape (Point position){
        this.setPosition(position);
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    // line D
    public Point getPosition() {
        return position;
    }

    public abstract double getArea();

    public abstract double getPerimeter();


}


