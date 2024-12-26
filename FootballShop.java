public abstract class FootballShop {
    private String brand;
    private double price;
    private int quantity;
    public FootballShop(){}

    public FootballShop(String brand, double price, int quantity) {
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public abstract void display();
    public abstract double calcPrice();
}
