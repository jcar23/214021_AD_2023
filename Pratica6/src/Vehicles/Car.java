package Vehicles;

public class Car extends Vehicle{
    private int doors;

    public Car(){
        super();
        this.doors = 0;
    }
    public Car(int doors, int year, double price, String model, String brand, String color){
        super(year, brand, model, price, color);
        this.doors = doors;
    }

    @Override
    public String toString(){
        return super.toString() + ", doors: " + doors;
    }
}
