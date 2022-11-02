package pt.uma.tpsi.arqd.vehicles;

public class Motorcycle extends Vehicle {
    private int wheel;
    public Motorcycle(){
        super();
        this.wheel =0;
    }

    @Override
    public void drive() {
        System.out.println("Driving a motorcycle");
    }

    public Motorcycle(int year, String brand, String model, double price, String color, int doors){
        super(year, brand, model, price, color);
        this.wheel = doors;
    }

    @Override

    public String toString(){
        return super.toString() + ", Wheel: " + this.wheel;
    }
}
