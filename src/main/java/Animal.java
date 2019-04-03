public class Animal {
    private int id;
    private String type;
    private double price;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Animal(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }
}
