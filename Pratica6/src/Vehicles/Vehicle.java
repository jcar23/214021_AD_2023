package Vehicles;

public abstract class Vehicle {
    private int year;
    private String brand;
    private String model;
    private double price;
    private String color;

    public Vehicle(){
        this.year = 0;
        this.brand= "";
        this.model= "";
        this.price= 0.0;
        this.color="";
    }

    public Vehicle(int year, String brand, String model, double price , String color ){
        this.year = year;
        this.brand= brand;
        this.model= model;
        this.price= price;
        this.color= color;
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

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "year: " + year + "brand: "+ brand +
                "model: " + model + "price: " +
                price + "color: " + color;
    }
}
