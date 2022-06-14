package DiningDeecoratorPattern;

public class JhalFry implements Food{
    private double foodPrice = 45;
    @Override
    public String prepareFood() {
        return "Jhal Fry";
    }

    @Override
    public double foodPrice() {
        return foodPrice;
    }
}
