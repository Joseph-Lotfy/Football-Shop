import java.text.NumberFormat;

public class SoccerBall extends FootballShop{
    private int BallType;
    private String ballTypeName = "";
    private double ballPrice = 0;
    public SoccerBall() {}

    public SoccerBall(String brand, double price, int quantity, int ballType) {
        super(brand, price, quantity);
        BallType = ballType;
    }

    @Override
    public void display() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        try {
            System.out.println("SOCCER BALL");
            System.out.println("Brand : " + getBrand());
            if(1 > BallType || BallType > 4){
                throw new NotBallTypeException(BallType + " Not a valid soccer ball type");
            }
            switch (BallType) {
                case 1:
                    ballTypeName = "Professional Match";
                    ballPrice = 200;
                    break;
                case 2:
                    ballTypeName = "Match";
                    ballPrice = 80;
                    break;
                case 3:
                    ballTypeName = "Training";
                    ballPrice = 50;
                    break;
                case 4:
                    ballTypeName = "Recreational";
                    ballPrice = 20;
                    break;
            }
            System.out.println("Type : " + ballTypeName);
            System.out.println("Price : " + fmt.format(ballPrice));
            System.out.println("No Discount!");
            System.out.println("Quantity : " + getQuantity());
            System.out.println("Subtotal : " + fmt.format(calcPrice()));
            System.out.println();
        }catch (NotBallTypeException n){
            System.out.println(n.getMessage() + ", Changing the Soccer ball type to training ball\n");
            BallType = 3;
            ballTypeName = "Training";
            ballPrice = 50;
            System.out.println("SOCCER BALL");
            System.out.println("Brand : " + getBrand());
            System.out.println("Type : " + ballTypeName);
            System.out.println("Price : " + fmt.format(ballPrice));
            System.out.println("No Discount!");
            System.out.println("Quantity : " + getQuantity());
            System.out.println("Subtotal : " + fmt.format(calcPrice()));
            System.out.println();
        }

    }

    @Override
    public double calcPrice() {
        return ballPrice * getQuantity();
    }
}
