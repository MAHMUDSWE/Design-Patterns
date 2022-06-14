package DiningDeecoratorPattern;

public class FriedBitterGourd extends FoodDecorator {
    private double foodPrice = 10;

    public FriedBitterGourd(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " With extra Fried Bitter Gourd";
    }

    @Override
    public double foodPrice() {
        return foodPrice;
    }
}
