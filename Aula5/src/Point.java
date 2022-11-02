public class Point {
    private double x;
    private double y;
    //Contractor por
    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }
    //Contractor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // setter modificador
    public void setX(double x) {
        this.x = x;
    }
    // setter
    public void setY(double y) {
        this.y = y;
    }

    // getter selector
    public double getX() {
        return x;
    }
    // getter
    public double getY() {
        return y;
    }

    public double distanceTo(Point other) {
        double distance = 0;
        distance = Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
        return distance;
    }
}
