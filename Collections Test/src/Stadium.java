
public class Stadium {
    private String name;
    private String country;
    private int capacity;

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Stadium(String name, String country, int capacity) {
        this.name = name;
        this.country = country;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Stadium Name: " + name + ", Country: " + country + ", capacity: " + capacity;
    }
}
