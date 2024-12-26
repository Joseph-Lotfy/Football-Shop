public class index {
    public static void main(String[] args) throws NotBallTypeException {
        FootballShop p1 = new SoccerBall("Addidas", 0, 3, 2);
        FootballShop p2 = new Boots("PUMA", 49.00, 3, 42);
        FootballShop p3 = new Boots("Nike", 50.00, 5, 46);
        FootballShop p4 = new SoccerBall("PUMA", 0, 4, 5);
        Customer c = new Customer("Jemmy Adams");
        System.out.println(c);
        c.buy(p1);
        c.buy(p2);
        c.buy(p3);
        c.buy(p4);
        c.print();
    }
}