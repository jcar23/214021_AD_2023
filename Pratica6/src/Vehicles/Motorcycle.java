package Vehicles;

public class Motorcycle extends Vehicle{
    private int wheel;

    public Motorcycle(){
        this.wheel = 0;
    }
    public Motorcycle(int wheel){
        this.wheel = wheel;
    }

    @Override
    public String toString(){
        return "wheel" + wheel;
    }
}
