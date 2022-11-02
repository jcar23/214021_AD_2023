package pt.uma.tpsi.arqd.shapes;

public class Rectangle extends Shape {
    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle (){
        this.topLeftPoint = new Point();
        this.height = 0.0;
        this.width = 0.0;
    }

    @Override
    public double getArea() {
        return width* height;
    }

    @Override
    public double getPerimeter() {
        return width* 2 + height * 2;
    }

    public Rectangle (Point topLeftPoint, double height, double width){
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    // b
    public Point getTopLeftPoint() {
        return topLeftPoint;
    }
    public void getHeight() {
        this.height= height;
    }

    public void getWidth() {
        this.width = width;
    }

    // c
    public void setTopLeftPoint (Point topLeftPoint){
        this.topLeftPoint = topLeftPoint;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double areaOfRectangle( double height, double width){
        return width* height;
    }

    public double perimeter ( double width, double height){
        return width* 2 + height * 2;
    }

    public boolean containsPoint(Point point){
        Point bottomLeftPoint = new Point(topLeftPoint.getX(), topLeftPoint.getY()-height);
        Point bottomRightPoint = new Point(bottomLeftPoint.getX() + width, bottomLeftPoint.getY());
        Point topRightPoint = new Point(bottomRightPoint.getX(), topLeftPoint.getY());
        if (point.getX() > topLeftPoint.getX() && point.getX() < topRightPoint.getX() &&
           point.getY() > bottomLeftPoint.getY() && point.getY() < topRightPoint.getY() ){
            return true;
        }
        else {
            return false;
        }

    }
    @Override
    public String toString(){
        return getClass().getSimpleName() + " - TopLeftPoint: " + position.toString() +
         ", width: "+ this.width +
                ", height "+ this.height;
    }

}
