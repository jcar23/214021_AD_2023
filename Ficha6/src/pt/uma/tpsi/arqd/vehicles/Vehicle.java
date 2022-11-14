package pt.uma.tpsi.arqd.vehicles;

public abstract class Vehicle {
    private int year;
    private String brand;
    private String model;
    private String color;
    private double price;


    public Vehicle(){ // construtor
        this.setYear(0);
        this.setBrand("");
        this.setModel("");
        this.setPrice(0.0);
        this.setColor("");
    }

    public Vehicle(int year, String brand, String model, double price, String color){
        this.setYear(year);
        this.setBrand(brand);
        this.setModel(model);
        this.setPrice(price);
        this.setColor(color);
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void drive();

    @Override
    // esse method vai ser usado
    public String toString(){
        return "Brand: " + this.brand + ", Model: " +
                this.model + ", year: " + this.year + ", price: " +
                this.price + ", color: " + this.color;
    }
}
