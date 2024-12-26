import java.util.ArrayList;
import  java.text.NumberFormat;
public class Customer {
    private String name;
    private ArrayList<FootballShop> itemList = new ArrayList<>();
    private int numOfItems;
    private double totalPay;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public double getTotalPay() {
        return totalPay;
    }
    public int getNumOfItems() {
        return numOfItems;
    }

    @Override
    public String toString() {
        String s = "Welcome " + name + "\n\nList of Football Items Bought\n";
        return s;
    }
    public void buy(FootballShop f)  {
        itemList.add(f);
        System.out.println("Item " + itemList.size());
        f.display();
    }
    public void print(){
        double total = 0;
        for(FootballShop item : itemList){
            total += item.calcPrice();
        }
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Total : " + fmt.format(total));
    }
}
