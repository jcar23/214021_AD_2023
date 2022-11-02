package pt.uma.tpsi.arqd.vehicles;

public class Car extends Vehicle {
    private int doors;
    public Car(){
        super();
        this.doors = 0;
    }

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    public Car(int year, String brand, String model, double price, String color, int doors){
        super(year, brand, model, price, color);
        this.doors = doors;
    }

    //public void drive();

    @Override
    public String toString(){
        return super.toString() + ", Doors: " + this.doors;
    }

}
