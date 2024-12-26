import java.text.NumberFormat;

public class Boots extends FootballShop implements DiscConsiderable{
    private int size;
    public Boots(){}

    public Boots(String brand, double price, int quantity, int size) {
        super(brand, price, quantity);
        this.size = size;
    }

    @Override
    public double calcDisc() {
        return getPrice() * (1 - DiscConsiderable.RATE);
    }

    @Override
    public void display() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        System.out.println("SOCCER BOOTS");
        System.out.println("Brand : " + getBrand());
        System.out.println("Price : " + fmt.format(getPrice()) + " for size " + size);
        System.out.println("Discount : " + (DiscConsiderable.RATE * 100) + "%");
        System.out.println("Quantity : " + getQuantity());

        System.out.println("Subtotal : " + fmt.format(calcPrice()));
        System.out.println();
    }

    @Override
    public double calcPrice() {
        return calcDisc() * getQuantity();
    }
}
