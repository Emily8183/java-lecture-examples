package chapter08;

// TODO: Refactor to set both a final originalPrice and a currentPrice and update toString()
public abstract class Product {

    private static int nextId = 1;

    private final double originalPrice;
    private double currentPrice;

    private final int id;
    private String name;
    private String desc;
    private double price;
    private int quantity;

    public Product(String name, String desc, double price, int quantity) {
        this.id = nextId;
        this.name = name;
        this.desc = desc;
        this.originalPrice = price;
        this.currentPrice = price;
        this.quantity = quantity;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        quantity -= amount;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "PRODUCT INFORMATION:" + Common.newline +
                "ID: " + id + Common.newline +
                "Item: " + name + Common.newline +
                "Description: " + desc + Common.newline +
                "Original Price: " + originalPrice + Common.newline +
                "Current Price: " + currentPrice + Common.newline +
                "Quantity: " + quantity + Common.newline;
    }

    public abstract String describe();

}
